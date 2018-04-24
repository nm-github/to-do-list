package edu.vinu.todolist.processor;

import edu.vinu.todolist.model.ToDoListEntry;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

@Component
public class ToDoListProcessor {
	private String file = "C:\\Users\\Intern1\\Documents\\to-do-list.txt";
	
	public List<ToDoListEntry> getList() {
		List<ToDoListEntry> list = new ArrayList<ToDoListEntry>();
		
		try (FileInputStream fis = new FileInputStream(new File(file))) {
			List<String> lines = IOUtils.readLines(fis, StandardCharsets.UTF_8);
			
			lines.forEach(line -> {
				String[] fields = line.split(ToDoListEntry.DELIMITER);
				ToDoListEntry entry = new ToDoListEntry(fields[2], fields[0], fields[1]);
				list.add(entry);
				System.out.println(entry);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
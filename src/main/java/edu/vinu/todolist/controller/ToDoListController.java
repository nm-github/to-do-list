package edu.vinu.todolist.controller;

import edu.vinu.todolist.model.ToDoListEntry;
import edu.vinu.todolist.processor.ToDoListProcessor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoListController {
	@Autowired
	private ToDoListProcessor processor;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/list")
    public String list(Model model) {
		List<ToDoListEntry> list = processor.getList();
        model.addAttribute("list", list);
        return "list";
    }
}
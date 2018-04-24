package edu.vinu.todolist.model;

public class ToDoListEntry {
	public static final String DELIMITER = ",";
	private String description;
	private String createDate;
	private String updateDate;
	
	public ToDoListEntry(String description, String createDate, String updateDate) {
		super();
		this.description = description;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "ToDoListEntry [description=" + description + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ "]";
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
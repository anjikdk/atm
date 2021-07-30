package com.mobiquity.atm.model;

public class TaskModel {

	private String description;
	private Long priority;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPriority() {
		return priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "TaskModel [description=" + description + ", priority=" + priority + "]";
	}
}

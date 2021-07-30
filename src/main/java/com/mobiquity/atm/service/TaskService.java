package com.mobiquity.atm.service;

import com.mobiquity.atm.model.TaskModel;

public interface TaskService {

	public void updateTask(Long id, TaskModel taskModel);
	
	public void addTask(Long id, TaskModel taskModel);
}

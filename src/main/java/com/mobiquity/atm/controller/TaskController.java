package com.mobiquity.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.atm.model.TaskModel;
import com.mobiquity.atm.service.TaskService;

@RestController
class TaskController {

	@Autowired
	private TaskService taskService;
	
	@PutMapping(value = "/tasks/{id}")
	public TaskModel updateTask(@PathVariable("id") Long id, @RequestBody TaskModel taskModel)
	{
		taskService.updateTask(id, taskModel);
		return taskModel;
	}
	
	@PostMapping(value = "/tasks/{id}")
	public TaskModel addTask(@PathVariable("id") Long id, @RequestBody TaskModel taskModel)
	{
		taskService.addTask(id, taskModel);
		return taskModel;
	}
}

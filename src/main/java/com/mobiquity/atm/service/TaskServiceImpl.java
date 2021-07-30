package com.mobiquity.atm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiquity.atm.exception.DataNotFoundException;
import com.mobiquity.atm.model.Task;
import com.mobiquity.atm.model.TaskModel;
import com.mobiquity.atm.repository.TaskRepository;

@Service
class TaskServiceImpl implements TaskService
{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public void updateTask(Long id, TaskModel taskModel) {
		
		if(taskModel.getDescription() == null)
		{
			throw new RuntimeException("Task description is required");
		}
		
		taskRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Cannot find task with given id : "+id));
		
		Task taskEntity = new Task();
		taskEntity.setId(id);
		taskEntity.setDescription(taskModel.getDescription());
		taskEntity.setPriority(taskModel.getPriority());
		
		taskRepository.save(taskEntity);
	}

	@Override
	public void addTask(Long id, TaskModel taskModel) {
		Task taskEntity = new Task();
		taskEntity.setId(id);
		taskEntity.setDescription(taskModel.getDescription());
		taskEntity.setPriority(taskModel.getPriority());
		
		taskRepository.save(taskEntity);
		
	}
	
}

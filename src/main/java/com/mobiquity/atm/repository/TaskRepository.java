package com.mobiquity.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobiquity.atm.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	
}

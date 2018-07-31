package com.revature.dao;

import java.util.List;

import com.revature.pojos.goals.Task;

public interface TaskDao {

	Task getTask(int id);
	
	Task putTask(Task task);
	
	void deleteTask(Task task);
	
	void updateTask(Task task);
	
	List<Task> getAllTasks();
}

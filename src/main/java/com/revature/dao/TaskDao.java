package com.revature.dao;

import java.util.List;

import com.revature.pojos.goals.Task;

public interface TaskDao {

	Task getTask(String name);
	
	boolean putTask(Task user);
	
	boolean deleteTask(Task user);
	
	boolean updateTask(Task user);
	
	List<Task> getAllTasks();
}

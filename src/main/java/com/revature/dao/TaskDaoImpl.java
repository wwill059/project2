package com.revature.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.goals.Task;




@Component
public class TaskDaoImpl implements TaskDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Task getTask(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean putTask(Task user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTask(Task user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTask(Task user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

}

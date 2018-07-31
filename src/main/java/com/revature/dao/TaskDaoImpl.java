package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.goals.Goal;
import com.revature.pojos.goals.Task;




@Component
public class TaskDaoImpl implements TaskDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Task getTask(int id) {
		Session sess = sessionFactory.getCurrentSession();
		
		
		return (Task)sess.get(Task.class, id);
	}

	@Override
	public Task putTask(Task task) {
		// TODO Auto-generated method stub
	Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
		
		sess.save(task);
		
		tx.commit();
		
		return task;
	}

	@Override
	public void deleteTask(Task task) {
		Session sess = sessionFactory.getCurrentSession();
		
Transaction tx = sess.beginTransaction();
		
		sess.delete(task);
		
		tx.commit();
		
	}

	@Override
	public void updateTask(Task task) {
		Session sess = sessionFactory.getCurrentSession();

		Transaction tx = sess.beginTransaction();
				
				sess.update(task);
				
				tx.commit();
	
	}

	@Override
	public List<Task> getAllTasks() {
Session sess = sessionFactory.getCurrentSession();
		
		Criteria criteria = sess.createCriteria(Task.class);
		
		return (List<Task>)criteria.list();
	}

}

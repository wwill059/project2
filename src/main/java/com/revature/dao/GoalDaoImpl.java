package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.revature.pojos.goals.Goal;



@Component
//@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
public class GoalDaoImpl implements GoalDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Goal getGoal(int id) {
		// TODO Auto-generated method stub
		
		Session sess = sessionFactory.getCurrentSession();
		
				
		return (Goal)sess.get(Goal.class, id);
	}

	@Override
	public Goal putGoal(Goal goal) {
		// TODO Auto-generated method stub
		
		Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
		
		sess.save(goal);
		
		tx.commit();
		
		return goal;
		
	
	}

	@Override
	public void deleteGoal(Goal goal) {
		// TODO Auto-generated method stub
		
		Session sess = sessionFactory.getCurrentSession();
		
Transaction tx = sess.beginTransaction();
		
		sess.delete(goal);
		
		tx.commit();
		

	}

	@Override
	public void updateGoal(Goal goal) {
		// TODO Auto-generated method stub
		
		
		Session sess = sessionFactory.getCurrentSession();

Transaction tx = sess.beginTransaction();
		
		sess.update(goal);
		
		tx.commit();
		
	}

	@Override
	public List<Goal> getAllGoals() {
		// TODO Auto-generated method stub
		
		Session sess = sessionFactory.getCurrentSession();
		
		Criteria criteria = sess.createCriteria(Goal.class);
		
		return (List<Goal>)criteria.list();
	}

}

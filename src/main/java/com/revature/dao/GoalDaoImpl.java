package com.revature.dao;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.goals.Goal;



@Component
//@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
public class GoalDaoImpl implements GoalDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Goal getGoal(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean putGoal(Goal user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGoal(Goal user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGoal(Goal user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Goal> getAllGoals() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.revature.dao;

import java.util.List;

import com.revature.pojos.goals.Goal;

public interface GoalDao {

	Goal getGoal(String name);
	
	boolean putGoal(Goal user);
	
	boolean deleteGoal(Goal user);
	
	boolean updateGoal(Goal user);
	
	List<Goal> getAllGoals();
}

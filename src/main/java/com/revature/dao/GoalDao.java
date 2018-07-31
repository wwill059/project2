package com.revature.dao;

import java.util.List;

import com.revature.pojos.goals.Goal;

public interface GoalDao {

	Goal getGoal(int id);
	
	Goal putGoal(Goal user);
	
	void deleteGoal(Goal user);
	
	void updateGoal(Goal user);
	
	List<Goal> getAllGoals();
}

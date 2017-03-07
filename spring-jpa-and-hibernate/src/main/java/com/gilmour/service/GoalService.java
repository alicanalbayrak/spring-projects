package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Goal;

public interface GoalService {

	Goal saveGoal(Goal goal);

	List<Goal> findAllGoals();
}

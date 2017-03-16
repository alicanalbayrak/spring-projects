package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Goal;
import com.gilmour.model.GoalReport;

public interface GoalService {

	Goal saveGoal(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}

package com.gilmour.repository;

import java.util.List;

import com.gilmour.model.Goal;
import com.gilmour.model.GoalReport;

public interface GoalRepository {

	Goal saveGoal(Goal goal);

	List loadAll();

	List<GoalReport> findAllGoalReports();
}

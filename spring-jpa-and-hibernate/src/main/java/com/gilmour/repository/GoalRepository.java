package com.gilmour.repository;

import java.util.List;

import com.gilmour.model.Goal;

public interface GoalRepository {

	Goal saveGoal(Goal goal);

	List loadAll();
}

package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Goal;
import com.gilmour.model.GoalReport;
import com.gilmour.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	@Override
	@Transactional
	public Goal saveGoal(Goal goal) {
		return goalRepository.saveGoal(goal);
	}

	@Override
	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
	}

	@Override
	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}

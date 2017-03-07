package com.gilmour.service;

import com.gilmour.model.Goal;
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

}

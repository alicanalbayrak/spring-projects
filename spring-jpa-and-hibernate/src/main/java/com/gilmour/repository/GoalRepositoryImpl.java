package com.gilmour.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gilmour.model.Goal;
import org.springframework.stereotype.Repository;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext private EntityManager em;

	@Override
	public Goal saveGoal(Goal goal) {

		em.persist(goal);
		em.flush();

		return goal;
	}

}

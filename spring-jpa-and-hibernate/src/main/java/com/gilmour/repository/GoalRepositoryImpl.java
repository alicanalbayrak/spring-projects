package com.gilmour.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public List<Goal> loadAll() {
		Query query = em.createQuery("Select g from Goal g");

		List goals = query.getResultList();

		return goals;
	}

}

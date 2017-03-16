package com.gilmour.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.gilmour.model.Goal;
import com.gilmour.model.GoalReport;
import org.springframework.stereotype.Repository;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext private EntityManager em;

	@Override
	public Goal saveGoal(Goal goal) {

		if(goal.getId() == null){
			em.persist(goal);
			em.flush();
		}else{
			goal = em.merge(goal);
		}

		return goal;
	}

	@Override
	public List<Goal> loadAll() {
		Query query = em.createQuery("Select g from Goal g");

		List goals = query.getResultList();

		return goals;
	}

	@Override
	public List<GoalReport> findAllGoalReports() {

//		Query query = em.createQuery("Select new com.gilmour.model.GoalReport(g.minutes, e.minutes, e.activity)"
//				+ "from Goal g, Exercise e where g.id = e.goal.id");

		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);

		return query.getResultList();
	}

}

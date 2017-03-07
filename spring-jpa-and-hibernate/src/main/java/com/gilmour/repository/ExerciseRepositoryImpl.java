package com.gilmour.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gilmour.model.Exercise;
import org.springframework.stereotype.Repository;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Exercise save(Exercise exercise) {

		em.persist(exercise);
		em.flush();

		return exercise;
	}
}

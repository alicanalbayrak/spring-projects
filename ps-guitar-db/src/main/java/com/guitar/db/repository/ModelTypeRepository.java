package com.guitar.db.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.ModelType;

@Repository
public class ModelTypeRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private ModelTypeJpaRepository modelTypeJpaRepository;

	/**
	 * Create
	 */
	public ModelType create(ModelType mt) {
		return modelTypeJpaRepository.saveAndFlush(mt);
	}

	/**
	 * Update
	 */
	public ModelType update(ModelType mt) {
		return modelTypeJpaRepository.saveAndFlush(mt);
	}

	/**
	 * Delete
	 */
	public void delete(ModelType mt) {
		modelTypeJpaRepository.delete(mt);
	}

	/**
	 * Find
	 */
	public ModelType find(Long id) {
		return modelTypeJpaRepository.findOne(id);
	}

}

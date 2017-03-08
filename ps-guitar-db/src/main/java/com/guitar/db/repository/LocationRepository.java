package com.guitar.db.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository
public class LocationRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private LocationJpaRepository locationJpaRepository;

	/**
	 * Create
	 */
	public Location create(Location loc) {
		return locationJpaRepository.saveAndFlush(loc);
	}

	/**
	 * Update
	 */
	public Location update(Location loc) {
		return locationJpaRepository.saveAndFlush(loc);
	}

	/**
	 * Delete
	 */
	public void delete(Location loc) {
		locationJpaRepository.delete(loc);
	}

	/**
	 * Find
	 */
	public Location find(Long id) {
		return locationJpaRepository.findOne(id);
	}

	/**
	 * Custom finder
	 */
	public List<Location> getLocationByStateName(String name) {
		@SuppressWarnings("unchecked")
		List<Location> locs = entityManager
				.createQuery("select l from Location l where l.state like :state")
				.setParameter("state", name + "%").getResultList();
		return locs;
	}
}

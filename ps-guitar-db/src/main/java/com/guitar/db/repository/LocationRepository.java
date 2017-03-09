package com.guitar.db.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.guitar.db.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationRepository {
	@PersistenceContext private EntityManager entityManager;

	@Autowired private LocationJpaRepository locationJpaRepository;

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
		@SuppressWarnings("unchecked") List<Location> locs = entityManager.createQuery("select l from Location l where l.state like :state").setParameter("state", name + "%")
				.getResultList();
		return locs;
	}

	public List<Location> findByStateLike(String aNew) {
		return locationJpaRepository.findByStateLike(aNew);
	}

	public List<Location> findByStateOrCountry(String s1, String s2) {
		return locationJpaRepository.findByStateOrCountry(s1, s2);
	}

	public List<Location> findByStateAndCountry(String state, String country) {
		return locationJpaRepository.findByStateAndCountry(state, country);
	}

	public List<Location> findByStateIsOrCountryEquals(String s1, String s2){
		return locationJpaRepository.findByStateIsOrCountryEquals(s1,s2);
	}

	public List<Location> findByStateNot(String state) {
		return locationJpaRepository.findByStateNot(state);
	}

	public List<Location> findByStateNotLike(String stateName){
		return locationJpaRepository.findByStateNotLike(stateName);
	}

	public List<Location> findByStateStartingWith(String stateName){
		return locationJpaRepository.findByStateIgnoreCaseStartingWith(stateName);
	}
}

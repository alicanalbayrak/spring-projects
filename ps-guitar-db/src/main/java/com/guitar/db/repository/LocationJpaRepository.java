package com.guitar.db.repository;

import java.util.List;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

	List<Location> findByStateLike(String stateName);

	List<Location> findByStateIgnoreCaseStartingWith(String stateName);

	List<Location> findByStateNotLike(String stateName);

	List<Location> findByStateOrCountry(String s1, String s2);

	List<Location> findByStateIsOrCountryEquals(String s1, String s2);

	List<Location> findByStateAndCountry(String state, String country);

	List<Location> findByStateNot(String state);
}

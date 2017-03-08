package com.guitar.db.repository;

import java.util.List;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

	List<Location> findByStateLike(String stateName);

}

package com.guitar.db.repository;

import java.util.Date;
import java.util.List;

import com.guitar.db.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {

	List<Manufacturer> findByFoundedDateBefore(Date date);

	List<Manufacturer> findByActiveTrue();

	List<Manufacturer> findByActiveFalse();

}

package com.guitar.db.repository;

import java.math.BigDecimal;
import java.util.List;

import com.guitar.db.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {

	List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal low, BigDecimal high);

	List<Model> findByModelTypeNameIn(List<String> modelTypes);

}

package com.carbuyer.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carbuyer.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	@Query(value="call getOrderByUser(:id)", nativeQuery = true)
	List<Map<String, ?>> getOrderByUser(@Param("id") Integer id);
	
}

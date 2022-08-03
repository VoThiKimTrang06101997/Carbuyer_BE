package com.carbuyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carbuyer.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
}

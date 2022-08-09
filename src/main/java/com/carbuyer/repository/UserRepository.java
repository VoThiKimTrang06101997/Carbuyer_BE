package com.carbuyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carbuyer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}

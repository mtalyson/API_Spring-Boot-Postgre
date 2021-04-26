package com.mtalyson.springpostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtalyson.springpostgres.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}

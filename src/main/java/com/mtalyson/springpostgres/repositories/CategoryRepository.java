package com.mtalyson.springpostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtalyson.springpostgres.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}

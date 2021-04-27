package com.mtalyson.springpostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtalyson.springpostgres.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
		
}

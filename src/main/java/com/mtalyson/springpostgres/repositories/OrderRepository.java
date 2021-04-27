package com.mtalyson.springpostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtalyson.springpostgres.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

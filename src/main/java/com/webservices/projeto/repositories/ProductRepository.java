package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

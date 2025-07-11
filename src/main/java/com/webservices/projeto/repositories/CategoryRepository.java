package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

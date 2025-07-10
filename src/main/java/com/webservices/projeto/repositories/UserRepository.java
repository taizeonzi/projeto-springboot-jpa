package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.OrderItem;
import com.webservices.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

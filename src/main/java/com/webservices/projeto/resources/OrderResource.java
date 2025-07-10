package com.webservices.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.projeto.entities.Order;
import com.webservices.projeto.services.OrderService;

@RestController //indica que esta classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/orders") //nome do recurso
public class OrderResource {
	
	@Autowired
	private OrderService service;

	//método que vai ser um endpoint para acessar os usuários
	//ResponseEntity, é um tipo específico do Spring para retornar respostas de requisições web
	@GetMapping //para indicar que esse método vai responder a requisição do tipo GET do HTTP
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
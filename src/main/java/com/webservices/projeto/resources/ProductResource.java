package com.webservices.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.projeto.entities.Product;
import com.webservices.projeto.services.ProductService;

@RestController //indica que esta classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/products") //nome do recurso
public class ProductResource {
	
	@Autowired
	private ProductService service;

	//método que vai ser um endpoint para acessar os usuários
	//ResponseEntity, é um tipo específico do Spring para retornar respostas de requisições web
	@GetMapping //para indicar que esse método vai responder a requisição do tipo GET do HTTP
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
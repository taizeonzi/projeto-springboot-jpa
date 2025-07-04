package com.webservices.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.projeto.entities.User;

@RestController //indica que esta classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value = "/users") //nome do recurso
public class UserResource {

	//método que vai ser um endpoint para acessar os usuários
	//ResponseEntity, é um tipo específico do Spring para retornar respostas de requisições web
	@GetMapping //para indicar que esse método vai responder a requisição do tipo GET do HTTP
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9989888", "12345");
		return ResponseEntity.ok().body(u);
		
	}
}
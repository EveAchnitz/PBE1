package com.senaidev.cadastrocliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	//ATRIBUTOS
	@Autowired
	private EnderecoService enderecoService;
	
	//MÉTODOS
	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	@GetMapping
	public List<Endereco> getAllEnderecos(){
		return enderecoService.getAllEnderecos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Endereco> getEnderecoById(@PathVariable long id) {
		Endereco endereco = enderecoService.getEnderecoById(id);
		
		if(endereco != null) {
			return ResponseEntity.ok(endereco);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable long id) {
		enderecoService.deleteEndereco(id);
	}
}

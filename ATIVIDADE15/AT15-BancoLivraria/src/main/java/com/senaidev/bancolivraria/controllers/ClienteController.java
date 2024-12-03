package com.senaidev.bancolivraria.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivraria.entities.Cliente;
import com.senaidev.bancolivraria.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	//ATRIBUTOS
	private ClienteService clienteService;
	
	//MÉTODOS
	@PostMapping
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getClienteById(Cliente cliente) {
		return clienteService.getAllClientes();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getAutorById(@PathVariable Long id) {
		Cliente cliente = clienteService.getClienteById(id);
		
		if(cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.status(404).body("O cliente de id "+ id +" não foi encontrado.");
		}
	}
	
	@GetMapping("/cpf/{cpf}")
	public Cliente getClienteByCpf(@PathVariable String cpf) {
		return clienteService.getClienteByCpf(cpf);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}
}

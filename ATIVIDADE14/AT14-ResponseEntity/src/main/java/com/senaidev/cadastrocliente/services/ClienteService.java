package com.senaidev.cadastrocliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Cliente;
import com.senaidev.cadastrocliente.repositories.ClienteRepository;

@Service
public class ClienteService {

	//ATRIBUTOS
	@Autowired
	private ClienteRepository clienteRepository;
	
	//MÉTODOS
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById(long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(long id) {
		clienteRepository.deleteById(id);
	}
}

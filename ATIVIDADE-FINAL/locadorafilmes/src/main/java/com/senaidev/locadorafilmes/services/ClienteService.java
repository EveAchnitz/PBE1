package com.senaidev.locadorafilmes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.locadorafilmes.entities.Cliente;
import com.senaidev.locadorafilmes.repositories.ClienteRepository;

@Service
public class ClienteService {

	//ATRIBUTOS
	@Autowired
	private ClienteRepository clienteRepository;
	
	//MÉTODOS
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
}

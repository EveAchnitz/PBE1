package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Cliente;
import com.senaidev.bancolivraria.repositories.ClienteRepository;

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
	
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	//Buscar pelo CPF
	public Cliente getClienteByCpf(String cpf) {
		return clienteRepository.findByCpf(cpf);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}

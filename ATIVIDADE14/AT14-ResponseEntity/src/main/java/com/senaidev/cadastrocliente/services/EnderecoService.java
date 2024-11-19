package com.senaidev.cadastrocliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	//ATRIBUTOS
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//MÉTODOS
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> getAllEnderecos() {
		return enderecoRepository.findAll();
	}
	
	public Endereco getEnderecoById(long id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	
	public void deleteEndereco(long id) {
		enderecoRepository.deleteById(id);
	}
}

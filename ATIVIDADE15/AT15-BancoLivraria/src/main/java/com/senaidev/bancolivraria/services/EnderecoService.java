package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Endereco;
import com.senaidev.bancolivraria.repositories.EnderecoRepository;

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

    public Endereco getEnderecosById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public void deleteEndereco(Long id) {
        enderecoRepository.deleteById(id);
    }
}

package com.senaidev.cadastrocliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Telefone;
import com.senaidev.cadastrocliente.repositories.TelefoneRepository;

@Service
public class TelefoneService {

	//ATRIBUTOS
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	//MÉTODOS
	public Telefone saveTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}
	
	public List<Telefone> getAllTelefones() {
		return telefoneRepository.findAll();
	}
	
	public Telefone getTelefoneById(long id) {
		return telefoneRepository.findById(id).orElse(null);
	}
	
	public void deleteTelefone(long id) {
		telefoneRepository.deleteById(id);
	}
}

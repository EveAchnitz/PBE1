package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Autor;
import com.senaidev.bancolivraria.repositories.AutorRepository;

@Service
public class AutorService {

	//ATRIBUTOS
	@Autowired
	private AutorRepository autorRepository;
	
	//MÉTODOS
	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}
	
	public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }
	
	public Autor getAutorById(Long id) {
        return autorRepository.findById(id).orElse(null);
    }
	
	public void deleteAutor(Long id) {
		autorRepository.deleteById(id);
	}
	
}

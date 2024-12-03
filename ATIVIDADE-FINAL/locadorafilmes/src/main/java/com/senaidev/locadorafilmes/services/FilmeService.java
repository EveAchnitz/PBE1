package com.senaidev.locadorafilmes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.locadorafilmes.entities.Filme;
import com.senaidev.locadorafilmes.repositories.FilmeRepository;

@Service
public class FilmeService {

	//ATRIBUTOS
	@Autowired
	private FilmeRepository filmeRepository;
	
	//MÉTODOS
	public Filme saveFilme(Filme filme) {
		return filmeRepository.save(filme);
	}
	
	public List<Filme> getAllFilmes() {
		return filmeRepository.findAll();
	}
	
	public Filme getFilmeById(Long id) {
		return filmeRepository.findById(id).orElse(null);
	}
	
	public void deleteFilme(Long id) {
		filmeRepository.deleteById(id);
	}
}

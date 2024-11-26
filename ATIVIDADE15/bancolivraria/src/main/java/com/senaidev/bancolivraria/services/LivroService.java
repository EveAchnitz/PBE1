package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Livro;
import com.senaidev.bancolivraria.repositories.LivroRepository;

@Service
public class LivroService {

	//ATRIBUTOS
	@Autowired
	private LivroRepository livroRepository;
	
	//MÉTODOS
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	//Buscar por ISBN
	public Livro getLivroByIsbn(String isbn) {
		return livroRepository.findByIsbn(isbn);
	}
	
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
}

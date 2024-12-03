package com.senaidev.bancolivraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivraria.entities.Livro;
import com.senaidev.bancolivraria.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	//ATRIBUTOS
	@Autowired
	private LivroService livroService;
	
	//MÉTODOS
	@PostMapping
	public Livro createLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping
	public List<Livro> getAllLivros() {
		return livroService.getAllLivros();
	}
	
	@GetMapping("/{id}")
	public Livro getLivroById(@PathVariable Long id) {
		return livroService.getLivroById(id);
	}
	
	@GetMapping("/isbn/{isbn}")
	public Livro getLivroByIsbn(@PathVariable String isbn) {
		return livroService.getLivroByIsbn(isbn);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLivro(@PathVariable Long id) {
		livroService.deleteLivro(id);
	}
}

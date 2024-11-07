package com.senaidev.saraiva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.saraiva.entities.Livro;
import com.senaidev.saraiva.services.LivroService;

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
	public List<Livro> getAllLivros(){
		return livroService.getAllLivros();
	}
	
	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable long id) {
		return livroService.getLivroById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLivro(@PathVariable long id) {
		livroService.deleteLivro(id);
	}
}

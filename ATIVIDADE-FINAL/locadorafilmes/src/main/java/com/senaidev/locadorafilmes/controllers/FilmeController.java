package com.senaidev.locadorafilmes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.locadorafilmes.entities.Filme;
import com.senaidev.locadorafilmes.services.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	//ATRIBUTOS
	@Autowired
	private FilmeService filmeService;
	
	//MÉTODOS
	@PostMapping
	public Filme createFilme(@RequestBody Filme filme) {
		return filmeService.saveFilme(filme);
	}
	
	@GetMapping
	public List<Filme> getAllFilmes() {
		return filmeService.getAllFilmes();
	}
	
	@GetMapping("/{id}")
	public Filme getFilmeById(@PathVariable Long id) {
		return filmeService.getFilmeById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFilme(@PathVariable Long id) {
		filmeService.deleteFilme(id);
	}
}

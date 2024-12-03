package com.senaidev.bancolivraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivraria.entities.Autor;
import com.senaidev.bancolivraria.services.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

	//ATRIBUTOS
	@Autowired
	private AutorService autorService;
	
	//MÉTODOS
	@PostMapping
	public Autor saveAutor(@RequestBody Autor autor) {
		return autorService.saveAutor(autor);
	}
	
	@GetMapping
	public List<Autor> getAllAutores(){
		return autorService.getAllAutores();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getAutorById(@PathVariable Long id) {
        Autor autor = autorService.getAutorById(id);
		
		if (autor != null) {
			return ResponseEntity.ok(autor);
		} else {
			return ResponseEntity.status(404).body("O autor de id "+ id +" não foi encontrado.");
		}	
    }
	
	@DeleteMapping("/{id}")
	public void deleteAutor(@PathVariable Long id) {
		autorService.deleteAutor(id);
	}
}

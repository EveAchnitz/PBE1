package com.senaidev.bancolivraria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
}

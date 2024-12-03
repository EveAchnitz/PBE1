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

import com.senaidev.bancolivraria.entities.Editora;
import com.senaidev.bancolivraria.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

	//ATRIBUTOS
	@Autowired
	private EditoraService editoraService;
	
	//MÉTODOS
	@PostMapping
	public Editora saveEditora(@RequestBody Editora editora) {
		return editoraService.saveEditora(editora);
	}
	
	@GetMapping
	public List<Editora> getAllEditoras() {
		return editoraService.getAllEditoras();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getEditoraById(@PathVariable Long id) {
		Editora editora = editoraService.getEditoraById(id);
		
		if(editora != null) {
			return ResponseEntity.ok(editora);
		} else {
			return ResponseEntity.status(404).body("A editora de id "+ id + " não foi encontrada.");
		}
		
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public Editora getEditoraByCnpj(@PathVariable String cnpj) {
		return editoraService.getEditoraByCnpj(cnpj);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEditora(@PathVariable Long id) {
		editoraService.deleteEditora(id);
	}
}

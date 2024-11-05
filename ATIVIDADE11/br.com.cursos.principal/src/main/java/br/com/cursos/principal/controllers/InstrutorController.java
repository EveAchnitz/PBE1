package br.com.cursos.principal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursos.principal.entities.Instrutor;
import br.com.cursos.principal.services.InstrutorService;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

	//ATRIBUTOS
	@Autowired
	private InstrutorService instrutorService;
	
	//MÉTODOS
	@PostMapping
	public Instrutor createInstrutor(@RequestBody Instrutor instrutor) {
		return instrutorService.saveInstrutor(instrutor);
	}
	
	@GetMapping
	public List<Instrutor> getAllInstrutores(){
		return instrutorService.getAllInstrutores();
	}
	
	@GetMapping("/{id}")
	public Instrutor getInstrutor(@PathVariable long id) {
		return instrutorService.getInstrutorById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteInstrutor(@PathVariable long id) {
		instrutorService.deleteInstrutor(id);
	}
}

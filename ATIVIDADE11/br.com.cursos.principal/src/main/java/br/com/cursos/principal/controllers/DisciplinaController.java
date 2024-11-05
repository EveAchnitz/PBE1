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

import br.com.cursos.principal.entities.Disciplina;
import br.com.cursos.principal.services.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

	//ATRIBUTOS
	@Autowired
	private DisciplinaService disciplinaService;
	
	//MÉTODOS
	@PostMapping
	public Disciplina createDisciplina(@RequestBody Disciplina disciplina) {
		return disciplinaService.saveDisciplina(disciplina);
	}
	
	@GetMapping
	public List<Disciplina> getAllDisciplinas(){
		return disciplinaService.getAllDisciplinas();
	}
	
	@GetMapping("/{id}")
	public Disciplina getDisciplina(@PathVariable long id) {
		return disciplinaService.getDisciplinaById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDisciplina(@PathVariable long id) {
		disciplinaService.deleteDisciplina(id);
	}
}

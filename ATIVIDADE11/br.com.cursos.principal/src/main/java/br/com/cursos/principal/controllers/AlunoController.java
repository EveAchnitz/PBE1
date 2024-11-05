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

import br.com.cursos.principal.entities.Aluno;
import br.com.cursos.principal.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	//ATRIBUTOS
	@Autowired
	private AlunoService alunoService;
	
	//MÉTODOS
	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoService.saveAluno(aluno);
	}
	
	@GetMapping
	public List<Aluno> getAllAlunos(){
		return alunoService.getAllAlunos();
	}
	
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable long id) {
		return alunoService.getAlunoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable long id) {
		alunoService.deleteAlunoById(id);
	}
}

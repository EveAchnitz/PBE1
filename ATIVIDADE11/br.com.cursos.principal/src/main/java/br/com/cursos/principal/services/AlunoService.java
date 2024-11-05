package br.com.cursos.principal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.principal.entities.Aluno;
import br.com.cursos.principal.repositories.AlunoRepository;

@Service
public class AlunoService {

	//ATRIBUTOS
	@Autowired
	private AlunoRepository alunoRepository;
	
	//MÉTODOS
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> getAllAlunos(){
		return alunoRepository.findAll();
	}
	
	public Aluno getAlunoById(long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public void deleteAlunoById(long id) {
		alunoRepository.deleteById(id);
	}
}

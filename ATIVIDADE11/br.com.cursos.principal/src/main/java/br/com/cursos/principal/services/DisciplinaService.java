package br.com.cursos.principal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.principal.entities.Disciplina;
import br.com.cursos.principal.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {

	//ATRIBUTOS
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	//MÉTODOS
	public Disciplina saveDisciplina(Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
	
	public List<Disciplina> getAllDisciplinas(){
		return disciplinaRepository.findAll();	
	}
	
	public Disciplina getDisciplinaById(long id) {
		return disciplinaRepository.findById(id).orElse(null);
	}
	
	public void deleteDisciplina(long id) {
		disciplinaRepository.deleteById(id);
	}
}

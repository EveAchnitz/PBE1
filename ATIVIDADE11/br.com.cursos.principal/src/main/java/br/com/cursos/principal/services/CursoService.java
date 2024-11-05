package br.com.cursos.principal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursos.principal.entities.Curso;
import br.com.cursos.principal.repositories.CursoRepository;

@Service
public class CursoService {

	//ATRIBUTOS
	@Autowired
	private CursoRepository cursoRepository;
	
	//MÉTODOS
	public Curso saveCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public List<Curso> getAllCursos(){
		return cursoRepository.findAll();
	}
	
	public Curso getCursoById(long id) {
		return cursoRepository.findById(id).orElse(null);
	}
	
	public void deleteCurso(long id) {
		cursoRepository.deleteById(id);
	}
}

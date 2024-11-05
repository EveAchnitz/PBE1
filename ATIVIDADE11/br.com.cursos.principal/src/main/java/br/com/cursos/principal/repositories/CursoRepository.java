package br.com.cursos.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursos.principal.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}

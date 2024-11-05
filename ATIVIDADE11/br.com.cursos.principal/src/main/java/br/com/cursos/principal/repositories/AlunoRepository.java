package br.com.cursos.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursos.principal.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}

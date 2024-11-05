package br.com.cursos.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursos.principal.entities.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

}

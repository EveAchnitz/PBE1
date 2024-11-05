package br.com.cursos.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursos.principal.entities.Instrutor;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long>{

}

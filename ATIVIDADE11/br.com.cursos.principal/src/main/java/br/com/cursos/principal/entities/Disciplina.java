package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisciplina;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descrição")
	private String descricao;
	
	@Column(name = "carga horária")
	private int cargaHoraria;
	
	//CONSTRUTORES
	public Disciplina() {
		
	}
	public Disciplina(int idDisciplina, String nome, String descricao, int cargaHoraria) {
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	//GETTERS E SETTERS
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}

package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	
	@Column(name = "título")
	private String titulo;
	
	@Column(name = "descrição")
	private String descricao;
	
	@Column(name = "carga horária")
	private int cargaHoraria;
	
	@Column(name = "nível de dificudade")
	private int nivelDificuldade;
	
	//CONSTRUTORES
	public Curso() {
		
	}
	public Curso(int idCurso, String titulo, String descricao, int cargaHoraria, int nivelDificuldade) {
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.nivelDificuldade = nivelDificuldade;
	}
	
	//GETTERS E SETTERS
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public int getNivelDificuldade() {
		return nivelDificuldade;
	}
	public void setNivelDificuldade(int nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}
}

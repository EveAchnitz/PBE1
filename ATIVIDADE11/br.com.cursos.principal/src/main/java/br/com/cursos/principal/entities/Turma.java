package br.com.cursos.principal.entities;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_turma")
public class Turma {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurma;
	
	@Column(name = "data início")
	private int dataInicio;
	
	@Column(name = "data término")
	private int dataTermino;
	
	@Column(name = "horário das aulas")
	private int horarioAulas;
	
	@Column(name = "vagas disponíveis")
	private int vagasDisponiveis;
	
	//CONSTRUTORES
	public Turma() {
		
	}
	public Turma(int idTurma, int dataInicio, int dataTermino, int horarioAulas, int vagasDisponiveis) {
		this.idTurma = idTurma;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.horarioAulas = horarioAulas;
		this.vagasDisponiveis = vagasDisponiveis;
	}
	
	//GETTERS E SETTERS
	public int getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(int dataTermino) {
		this.dataTermino = dataTermino;
	}
	public int getHorarioAulas() {
		return horarioAulas;
	}
	public void setHorarioAulas(int horarioAulas) {
		this.horarioAulas = horarioAulas;
	}
	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}
	public void setVagasDisponiveis(int vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
	}
}

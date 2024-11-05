package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_instrutor")
public class Instrutor {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInstrutor;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private int telefone;
	
	@Column(name = "especialização")
	private String especializacao;
	
	@Column(name = "experiência")
	private String experiencia;
	
	//CONSTRUTORES
	public Instrutor(){
		
	}
	public Instrutor(int idInstrutor, String nome, String email, int telefone, String especializacao, String experiencia) {
		this.idInstrutor = idInstrutor;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.especializacao = especializacao;
		this.experiencia = experiencia;
	}
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
}

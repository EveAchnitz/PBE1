package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="cpf", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name="rg", length = 9, nullable = false, unique = true)
	private String rg;
	
	@Column(name="email", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name="telefone", length = 13, unique = true)
	private String telefone;
	
	//CONSTRUTORES
	public Cliente() {
		
	}
	
	public Cliente(Long id_cliente, String nome, String cpf, String rg, String email, String telefone) {
		this.cpf = cpf;
		this.email = email;
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
	}
	
	//GETTERS E SETTERS
	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

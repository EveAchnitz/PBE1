package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_endereco")
public class Endereco {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;
	
	@Column(name="rua", length = 100, nullable = false)
	private String rua;
	
	@Column(name="nm_casa", nullable = false)
	private int nm_casa;
	
	@Column(name="bairro", length = 100, nullable = false)
	private String bairro;
	
	@Column(name="cidade", length = 100, nullable = false)
	private String cidade;
	
	@Column(name="estado", length = 2, nullable = false)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_id_cliente")
	private Cliente cliente;
	
	//CONSTRUTORES
	public Endereco() {
		
	}
	public Endereco(Long id_endereco, String rua, int nm_casa, String bairro, String cidade, String estado) {
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.id_endereco = id_endereco;
		this.nm_casa = nm_casa;
		this.rua = rua;
	}
	
	//GETTERS E SETTERS
	public Long getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNm_casa() {
		return nm_casa;
	}
	public void setNm_casa(int nm_casa) {
		this.nm_casa = nm_casa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

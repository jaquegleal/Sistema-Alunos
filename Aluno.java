package com.sistemaalunos.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private long codigo;
	
	private String nome;
	private int altura;
	private int peso;
	private String modalidade;
	private String situacao;	
	private String emprovas;
	private int imc;

	private Object sim;	
	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getEmprovas() {
		return emprovas;
	}

	public void setEmprovas(String emprovas) {
		this.emprovas = emprovas;
	
	}

	public int getImc() {
		return imc;
	}

	public void setImc(String imc) {
		this.imc =  peso * (altura^2);
	}
	
	boolean estudo = situacao.emprovas (sim);{
	if estudo = emprovas;
	System.out.println("Não Precisa IMC" );
	}
	
	{
	System.out.println(nome);
	}
	
}

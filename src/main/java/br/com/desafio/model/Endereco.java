package br.com.desafio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.desafio.persistence.PersistenceEntity;

@Entity
@Table(name = "Endereco")
public class Endereco extends PersistenceEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String estado;
	private String cidade;
	private String logradouro;
	private int numero;
	private String cep;
	
	@ManyToOne
	private Pessoa pessoa;
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}

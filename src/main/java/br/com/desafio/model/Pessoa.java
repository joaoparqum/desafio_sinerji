package br.com.desafio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.desafio.persistence.PersistenceEntity;

@Entity
@Table(name = "Pessoa")
public class Pessoa extends PersistenceEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private Date idade;
	private String sexo;
	
	@OneToMany
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getIdade() {
		return idade;
	}
	public void setIdade(Date idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		
	

}

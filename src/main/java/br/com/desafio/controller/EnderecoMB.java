package br.com.desafio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.desafio.model.Endereco;

@Named("bean2")
@SessionScoped
public class EnderecoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Endereco endereco;
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	public String adicionar() {
		
		enderecos.add(endereco);
		
		limpar();
		
		return null;
		
	}
	
	private void limpar() {
		
		endereco = new Endereco();
		
	}

}

package br.com.desafio.service;

import java.util.List;

import br.com.desafio.model.Pessoa;

public interface IService {
	
    public abstract Pessoa savePessoa(Pessoa pessoa);
    public abstract void deletePessoa(Pessoa pessoa);
    public abstract Pessoa updatePessoa(Pessoa pessoa);
    public abstract List<Pessoa> getAllPessoa();
    
    public List<Pessoa> findByNome(String nome);

}

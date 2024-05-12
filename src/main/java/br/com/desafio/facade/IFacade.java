package br.com.desafio.facade;

import java.util.List;

import br.com.desafio.model.Pessoa;

public interface IFacade {
	
	public abstract Pessoa savePessoa(Pessoa pessoa);
    public abstract void deletePessoa(Pessoa pessoa);
    public abstract Pessoa updatePessoa(Pessoa pessoa);
    public abstract List<Pessoa> getAllPessoa();
    
    public List<Pessoa> findByNome(String nome);

}

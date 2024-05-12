package br.com.desafio.pessoa;

import java.util.List;

import br.com.desafio.dao.IBaseDAO;
import br.com.desafio.model.Pessoa;

public interface IDAOPessoa extends IBaseDAO<Pessoa>{
	
	public abstract List<Pessoa> findByNome(String nome);

}

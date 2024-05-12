package br.com.desafio.pessoa;

import java.util.List;

import javax.persistence.Query;

import br.com.desafio.dao.DAO;
import br.com.desafio.model.Pessoa;

public class DAOPessoa extends DAO<Pessoa> implements IDAOPessoa{

	@Override
	public List<Pessoa> findByNome(String nome) {
		String busca = "SELECT a FROM Pessoa AS a WHERE a.descricao like '%:nome%' ";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", nome);
        return query.getResultList();
	}

	
	
	
}

package br.com.desafio.facade;

import java.util.List;
import br.com.desafio.service.*;

import br.com.desafio.model.Pessoa;

public class Facade implements IFacade{
	
	private final IService servicePessoa = new Service();

	@Override
	public Pessoa savePessoa(Pessoa pessoa) {
		return servicePessoa.savePessoa(pessoa);
	}

	@Override
	public void deletePessoa(Pessoa pessoa) {
		this.servicePessoa.deletePessoa(pessoa);
	}

	@Override
	public Pessoa updatePessoa(Pessoa pessoa) {
		return servicePessoa.updatePessoa(pessoa);
	}

	@Override
	public List<Pessoa> getAllPessoa() {
		return servicePessoa.getAllPessoa();
	}

	@Override
	public List<Pessoa> findByNome(String nome) {
		return servicePessoa.findByNome(nome);
	}

}

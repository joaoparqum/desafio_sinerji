package br.com.desafio.service;

import java.util.List;

import br.com.desafio.exception.BusinessException;
import br.com.desafio.pessoa.*;
import br.com.desafio.model.*;

public class Service implements IService{

    public final static String PESSOA_NULL = "Pessoa null";
    
    public final static String PESSOA_EXISTE = "A pessoa já existe,";
    
    public final static String PESSOA_NAO_EXISTE = "A pessoa não existe na base de dados";
    
    public final static String PESSOA_INVALIDA = "Pessoa inválida";
    
    //objeto
    private final IDAOPessoa daoPessoa = new DAOPessoa();
    
    //metodos
    @Override
    public Pessoa savePessoa(Pessoa pessoa) {
        
        if(pessoa == null){
            throw new BusinessException(PESSOA_NULL);
        }
        if(daoPessoa.findById(pessoa.getId()) != null) {
            throw new BusinessException(PESSOA_EXISTE);
        } 
        
        return daoPessoa.save(pessoa);
    }

    @Override
    public void deletePessoa(Pessoa tarefa) {
       if(tarefa == null){
            throw new BusinessException(PESSOA_NULL);
        }
       if(this.daoPessoa.findById(tarefa.getId()) == null) {
            throw new BusinessException(PESSOA_NAO_EXISTE);
        }
       
        this.daoPessoa.delete(tarefa);
    }

    @Override
    public Pessoa updatePessoa(Pessoa pessoa) {
        if(pessoa == null) {
            throw new BusinessException(PESSOA_NULL);
        }
        if(daoPessoa.findById(pessoa.getId()) == null) {
           throw new BusinessException(PESSOA_NAO_EXISTE);
        }
          return daoPessoa.update(pessoa);
    }

    @Override
    public List<Pessoa> getAllPessoa() {
        return daoPessoa.findAll();
    }

    @Override
    public List<Pessoa> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("Nome null");
        } 
        
        return daoPessoa.findByNome(nome);
        
    }
	
}

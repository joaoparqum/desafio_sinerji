package br.com.desafio.persistence;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PersistenceEntity {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

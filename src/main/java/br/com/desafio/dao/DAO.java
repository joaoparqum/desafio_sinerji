package br.com.desafio.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import br.com.desafio.persistence.PersistenceEntity;

public class DAO<Entity extends PersistenceEntity> implements IBaseDAO<Entity>{
	
	protected static EntityManager entityManager;
    
    static{
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("meubanco");
        entityManager = fac.createEntityManager();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Entity save(Entity entity){
       entityManager.getTransaction().begin();
       entityManager.persist(entity);
       entityManager.getTransaction().commit();
       return entity;
        
    }
    
    /**
     * {@inheritDoc}
     * @param entity
     * @return 
     */
    @Override
    public Entity update(Entity entity){
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return entity;

    }
    
    /**
     * {@inheritDoc}
     * @param entity
     */
    @Override
    public void delete(Entity entity){
       entity = findById(entity.getId());
       entityManager.getTransaction().begin();
       entityManager.remove(entity);
       entityManager.getTransaction().commit();       
    }
    
    /**
     * {@inheritDoc}
     * @return 
     */
    @Override
    public List<Entity> findAll(){
        return entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }
    
    
    /**
     * {@inheritDoc}
     * @param id
     * @return 
     */
    @Override
    public Entity findById(Long id){
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
     protected Class<?> getTypeClass(){
        
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        
        return clazz;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }

}

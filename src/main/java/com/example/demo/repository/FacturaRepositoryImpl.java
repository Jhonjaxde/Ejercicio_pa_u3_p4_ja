package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepositoryImpl implements IFacturaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override

	public List<Producto> listaProductos(String codigoDeBarras,Integer stock) {

	   

	    CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();

	    CriteriaQuery<Producto> myQuery=myBuilder.createQuery(Producto.class);

	    Root<Producto> miRoot = myQuery.from(Producto.class);

	    Predicate condicion=myBuilder.equal(miRoot.get("codigoBarras"), codigoDeBarras);

	    Predicate condicion1=myBuilder.equal(miRoot.get("stock"), stock);

	    myQuery.select(miRoot).where(condicion,condicion1);

	    TypedQuery<Producto> myQFinal=this.entityManager.createQuery(myQuery);

	    

	    

	    return myQFinal.getResultList();

	}
}

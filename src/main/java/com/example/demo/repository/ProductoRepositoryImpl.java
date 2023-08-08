package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	public Producto seleccionar(Integer id) {
		
		return this.entityManager.find(Producto.class, id);
	}

}

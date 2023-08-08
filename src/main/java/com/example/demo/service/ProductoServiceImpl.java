package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void agregar(Producto producto) {
		this.iProductoRepository.insertar(producto);

	}

	@Override
	public Producto buscar(Integer id) {

		return this.iProductoRepository.seleccionar(id);
	}

}

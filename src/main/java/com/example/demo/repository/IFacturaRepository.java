package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IFacturaRepository {
	public List<Producto> listaProductos(String codigoDeBarras,Integer stock);
}

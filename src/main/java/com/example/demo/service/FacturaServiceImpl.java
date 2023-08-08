package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepository;
import com.example.demo.repository.modelo.Producto;
@Service
public class FacturaServiceImpl implements IFacturaService {
@Autowired
private IFacturaRepository facturaRepository;
	@Override
	public List<Producto> listaProductos(String codigoBarras, Integer stock) {
		
		return this.facturaRepository.listaProductos(codigoBarras, stock);
	}

}

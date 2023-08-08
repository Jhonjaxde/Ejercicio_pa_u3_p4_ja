package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@GeneratedValue(generator = "seq_producto", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)

	@Id
	@Column(name = "pro_id")
	private Integer id;
	@Column(name = "pro_codigoDeBarras")
	private String codigoDeBarras;
	@Column(name = "pro_nombre")
	private String nombre;
	@Column(name = "pro_categoria")
	private String categoria;
	@Column(name = "pro_stock")
	private Integer stock;
	@Column(name = "pro_precio")
	private BigDecimal precio;

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DetalleFactura> detallesFacturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<DetalleFactura> getDetallesFacturas() {
		return detallesFacturas;
	}

	public void setDetallesFacturas(List<DetalleFactura> detallesFacturas) {
		this.detallesFacturas = detallesFacturas;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoDeBarras=" + codigoDeBarras + ", nombre=" + nombre + ", categoria="
				+ categoria + ", stock=" + stock + ", precio=" + precio + ", detallesFacturas=" + detallesFacturas
				+ "]";
	}
	
	
	
}

package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleFactura")
public class DetalleFactura {
	@GeneratedValue(generator = "seq_detalleFactura", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_detalleFactura", sequenceName = "seq_detalleFactura", allocationSize = 1)
	
	@Id
	@Column(name = "det_id")
	private Integer id;
	@Column(name = "det_cantidad")
	private String cantidad;
	@Column(name = "det_preciounitario")
	private BigDecimal preciounitario;
	@Column(name = "det_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne()
	@JoinColumn(name = "det_id_factura")
	private Factura factura;
	@ManyToOne()
	@JoinColumn(name = "det_id_producto")
	private Producto producto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPreciounitario() {
		return preciounitario;
	}
	public void setPreciounitario(BigDecimal preciounitario) {
		this.preciounitario = preciounitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}

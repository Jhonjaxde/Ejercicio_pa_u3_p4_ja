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
@Table(name = "factura")
public class Factura {
	
	@GeneratedValue(generator = "seq_factura", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_factura", sequenceName = "seq_factura", allocationSize = 1)
	
	@Id
	@Column(name = "fact_id")
	private Integer id;
	@Column(name = "fact_cedulaCliente")
	private String cedulaCliente;
	@Column(name = "fact_totalFactura")
	private BigDecimal totalFactura;
	
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DetalleFactura> detallesFacturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public List<DetalleFactura> getDetallesFacturas() {
		return detallesFacturas;
	}

	public void setDetallesFacturas(List<DetalleFactura> detallesFacturas) {
		this.detallesFacturas = detallesFacturas;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", cedulaCliente=" + cedulaCliente + ", totalFactura=" + totalFactura
				+ ", detallesFacturas=" + detallesFacturas + "]";
	}
	
	

}

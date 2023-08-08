package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4JaApplication implements CommandLineRunner{
	
	@Autowired
	private IFacturaService facturaService;
	private IProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto pro = new Producto();
		pro.setCategoria("Gaseosas");
		pro.setCodigoDeBarras("123");
		pro.setNombre("Coca Cola 2L");
		pro.setPrecio(new BigDecimal(1.5));
		pro.setStock(1);
		
		
		Factura fac= new Factura();
		fac.setCedulaCliente(null);
		fac.setTotalFactura(new BigDecimal(22));
		
		DetalleFactura det = new DetalleFactura();
		det.setCantidad(null);
		det.setPreciounitario(new BigDecimal(2));
		det.setSubtotal(new BigDecimal(det.getCantidad()));
		
		List<DetalleFactura> reporte= new ArrayList<>();
		reporte.add(det);
		
		pro.setDetallesFacturas(reporte);
		fac.setDetallesFacturas(reporte);
		det.setFactura(fac);
		det.setProducto(pro);
		this.productoService.agregar(pro);
		
		
	}

}

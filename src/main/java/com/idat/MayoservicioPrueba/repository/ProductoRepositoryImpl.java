package com.idat.MayoservicioPrueba.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoservicioPrueba.model.Productos;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
	
	public List<Productos> listar = new ArrayList<Productos>();

	@Override
	public void guardarProducto(Productos producto) {
		listar.add(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		Productos p = obtenerProductoId(producto.getIdProducto());
		listar.remove(p);
		listar.add(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		Productos p = obtenerProductoId(id);
		listar.remove(p);
	}

	@Override
	public List<Productos> listarProductos() {
		return listar;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// Metodo 01: metodo tradicional
//		if (listar != null) {
//			for (Productos productos : listar) {
//				if (productos.getIdProducto() == id)
//					return productos;
//			}
//		}
//		return null;
		
		// Metodo 02: a partir de java 8 con flujos
		return listar.stream().filter(p ->p.getIdProducto()==id).findFirst().orElse(null);
	}

}
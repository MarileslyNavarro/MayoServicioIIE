package com.idat.MayoservicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoservicioPrueba.model.Productos;
import com.idat.MayoservicioPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		repository.guardarProducto(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		repository.actualizarProducto(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);
	}

	@Override
	public List<Productos> listarProductos() {
		return repository.listarProductos();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		return repository.obtenerProductoId(id);
	}

}

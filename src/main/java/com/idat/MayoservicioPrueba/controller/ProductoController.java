package com.idat.MayoservicioPrueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoservicioPrueba.model.Productos;
import com.idat.MayoservicioPrueba.service.ProductoService;

@Controller
@RequestMapping("/producto/v1")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@RequestMapping("/listar")
	public @ResponseBody List<Productos> listar() {
		return service.listarProductos();
	}
	
}

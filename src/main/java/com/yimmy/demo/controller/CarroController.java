package com.yimmy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Carro;
import com.yimmy.demo.service.CarroService;
import com.yimmy.demo.service.PropietarioService;

@RestController
@RequestMapping("/carro")
public class CarroController {
	
	private final CarroService service;
	private final PropietarioService serviceP;
	
	public CarroController(CarroService service,PropietarioService serviceP)
	{
		this.service = service;
		this.serviceP = serviceP;
		
	}

	
	// listar Carros
	
	@GetMapping
	public Iterable<Carro> List()
	{
		return service.List();
	}
	
	// Crear Carro
	
	@PostMapping
	public String create(@RequestBody Carro carro)
	{
		
		//return service.save(carro,serviceP.find(carro.getIdPropietario()));
		return service.save(carro,serviceP.find(carro.getIdPropietario()));
	}
	
	
}

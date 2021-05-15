package com.yimmy.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Propietario;
import com.yimmy.demo.service.PropietarioService;


@RestController
@RequestMapping("/propietario")
public class PropietarioController {
	
	
	private final PropietarioService service;
	
	public PropietarioController(PropietarioService service)
	{
		this.service = service;
	}
	
	// retornar los datos de los propietarios
	@GetMapping
	public Iterable<Propietario> List()
	{
		return service.List();
	}
	
	// crear el propietario
	
	@PostMapping
	public Propietario create(@RequestBody Propietario propietario)
	{
		return service.save(propietario);
	}
	
	

}

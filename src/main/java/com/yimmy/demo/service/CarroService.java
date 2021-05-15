package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Carro;
//import com.yimmy.demo.entity.Propietario;


@Service
public class CarroService {

	private List<Carro> carros;
	//Propietario p = new Propietario();
	
	//Crear Carros
	
	public CarroService()
	{
		carros = new ArrayList<>();
	}
	
	
	//Listar Carros
	public List<Carro> List()
	{
		return carros;
	}
	
	//Crear Carros
	public String save(Carro carro, int id)
	{		
		if(id== carro.getIdPropietario())
			{
				carros.add(carro);
				return "Carro Creado";
			}
			
		 return "propietario no existe";
	}
	
	
}

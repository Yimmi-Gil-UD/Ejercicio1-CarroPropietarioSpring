package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.yimmy.demo.entity.Propietario;

@Service
public class PropietarioService {
	
	private List<Propietario> propietarios;
	
	//CrearPropietario
	
	public  PropietarioService()
	{
		propietarios = new ArrayList<>();
	}
	
	public List<Propietario> List()
	{
		return propietarios;
	}
	
	
	public Propietario save(Propietario pro)
	{
		propietarios.add(pro);
		return pro;
	}

	
	public int find(int id)
	{
		for(Propietario propietario : propietarios)
		{
			if(propietario.getId() == id)
			{
				return propietario.getId();
			}
		}
		return 0;
	}
	
}

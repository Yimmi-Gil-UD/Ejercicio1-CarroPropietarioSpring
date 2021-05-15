package com.yimmy.demo.entity;

public class Propietario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String numeroDocumento;
	
	public Propietario() {
		
	}

	public Propietario(int id, String nombre, String apellido, String numeroDocumento) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = numeroDocumento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	
	

}

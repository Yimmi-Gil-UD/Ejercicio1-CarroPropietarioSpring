package com.yimmy.demo.entity;

public class Carro {

	private int id;
	private String marca;
	private int modelo;
	private String tipoVehiculo;
	private int costo;
	private int idPropietario;
	
	
	public Carro() {
		
	}


	public Carro(int id, String marca, int modelo, String tipoVehiculo, int costo, int idPropietario) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.costo = costo;
		this.idPropietario = idPropietario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public String getTipoVehiculo() {
		return tipoVehiculo;
	}


	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}


	public long getCosto() {
		return costo;
	}


	public void setCosto(int costo) {
		this.costo = costo;
	}


	public int getIdPropietario() {
		return idPropietario;
	}


	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}
	
	
	
	
	
}

package com.dccs.base.model;

import java.util.Collection;
import java.util.Date;

public class Cliente {

	private String nombre;
	private Integer id;
	private Date fechaNacimiento;
	private Collection<String> facturas;
	private String nif;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Collection<String> getFacturas() {
		return facturas;
	}

	public void setFacturas(Collection<String> facturas) {
		this.facturas = facturas;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public static void saludarComoCliente(){
		System.out.println("Hola");
	}
}

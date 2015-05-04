package com.curso.java.model;

import java.util.Collection;

public class Aula {
	
	private String id;
	private Collection<PuestoDelAlumno> puestosDeAlumnos;
	private PuestoDelProfesor puestoDelProfesor;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Collection<PuestoDelAlumno> getPuestosDeAlumnos() {
		return puestosDeAlumnos;
	}
	public void setPuestosDeAlumnos(Collection<PuestoDelAlumno> puestosDeAlumnos) {
		this.puestosDeAlumnos = puestosDeAlumnos;
	}
	public PuestoDelProfesor getPuestoDelProfesor() {
		return puestoDelProfesor;
	}
	public void setPuestoDelProfesor(PuestoDelProfesor puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}
	
}

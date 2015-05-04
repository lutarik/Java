package com.dccs.aula.model;


public class Aula {

	private String id;
	private PuestoDeAlumno[] alumnos;
	private PuestoDeProfesor profe;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public PuestoDeAlumno[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(PuestoDeAlumno[] alumnos) {
		this.alumnos = alumnos;
	}
	public PuestoDeProfesor getProfe() {
		return profe;
	}
	public void setProfe(PuestoDeProfesor profe) {
		this.profe = profe;
	}



}

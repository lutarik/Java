package com.dccs.aula;

import com.dccs.aula.model.Aula;
import com.dccs.aula.model.Equipo;
import com.dccs.aula.model.Persona;
import com.dccs.aula.model.PuestoDeAlumno;
import com.dccs.aula.model.PuestoDeProfesor;

public class Lanzador {
	public static void main(String[] args) {
		PuestoDeProfesor profe = new PuestoDeProfesor();
		Persona profesor = new Persona();
		Aula aula = new Aula();
		Equipo equipoDeProfesor = new Equipo();
		
		PuestoDeAlumno[] puestosDeAlumnos = new PuestoDeAlumno[16];		
		
		for (int i = 0; i < puestosDeAlumnos.length; i++) {
			PuestoDeAlumno puestoDeAlumno = crearPuestoDeAlumnoCompleto();
			puestosDeAlumnos[i]=puestoDeAlumno;
		}
		
		profe.setPersona(profesor);
		profe.setPc(equipoDeProfesor);
		aula.setProfe(profe);
		aula.setAlumnos(puestosDeAlumnos);
	}

	private static PuestoDeAlumno crearPuestoDeAlumnoCompleto() {
		//Crear un puesto de alumno nuevo
		PuestoDeAlumno puestoDeAlumno = new PuestoDeAlumno();
		//Crear la persona
		Persona alumno = new Persona();
		//Crear el equipo
		Equipo pc = new Equipo();
		//Asignar persona a puesto alumno
		puestoDeAlumno.setPersona(alumno);
		//Asignar equipo al puesto
		puestoDeAlumno.setPc(pc);
		
		return puestoDeAlumno;
	}
}
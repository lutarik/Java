package com.curso.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.curso.java.dao.Color;
import com.curso.java.model.Aula;
import com.curso.java.model.Equipo;
import com.curso.java.model.Persona;
import com.curso.java.model.PuestoDelAlumno;
import com.curso.java.model.PuestoDelProfesor;

public class LanzadorAulaAT1 {

	public static void main(String[] args) {
		Aula aulaAT1 = new Aula();
		PuestoDelProfesor puestoDelProfe = new PuestoDelProfesor();
		Collection<PuestoDelAlumno> puestosDeAlumnos = new ArrayList<>();
		// OFF-TOPIC
		// esto no puedo! puestosDeAlumnos.add("Patata");
		// meterPatatas(puestosDeAlumnos);
		// END
		Color miColor = Color.ROJO;
		miColor.toString();
		for(int i=0;i< 16 ;i++){
			// Crear un puesto de alumno COM-PLE-TO
			// Asignarlo a la posicion del array correcto
			puestosDeAlumnos.add(crearPuestoDeAlumnoComPleTo());

		}
		aulaAT1.setPuestoDelProfesor(puestoDelProfe);
		aulaAT1.setPuestosDeAlumnos(puestosDeAlumnos);

	}

//	private static void meterPatatas(
//			Collection puestosDeAlumnos) {
//	puestosDeAlumnos.add("Pimientos");
//		
//	}

	private static PuestoDelAlumno crearPuestoDeAlumnoComPleTo() {
		// Crear puesto de alumno
		PuestoDelAlumno puestoDelAlumno = new PuestoDelAlumno();
		Equipo equipo = new Equipo();
		Persona alumno = new Persona();
		puestoDelAlumno.setAlumno(alumno);
		puestoDelAlumno.setEquipo(equipo);
		return puestoDelAlumno ;
	}

}

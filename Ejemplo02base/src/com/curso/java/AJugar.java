package com.curso.java;

import java.util.Collection;

import com.curso.java.dao.AulaMapDAOImpl;
import com.curso.java.dao.IAulaDAO;
import com.curso.java.model.Aula;
import com.curso.java.negocio.GestionAulasLN;

public class AJugar {
	public static void main(String[] args) {
		GestionAulasLN aulasLN = new GestionAulasLN();
		IAulaDAO aulaListDAOImpl = new AulaMapDAOImpl();
		aulasLN.setMiDao(aulaListDAOImpl);
		Aula[] arrayNativoDeAulas = new Aula[3];
		Aula aula1 = new Aula();
		Aula aula2 = new Aula();
		Aula aula3 = new Aula();
		aula1.setId("A1");
		aula2.setId("A2");
		aula3.setId("B1");
		arrayNativoDeAulas[0]= aula1;
		arrayNativoDeAulas[1]= aula2;
		arrayNativoDeAulas[2]= aula3;
		aulasLN.darDeAltaAulas(arrayNativoDeAulas);
		Collection<Aula> mostrarAulasQueEmpiecenPor = aulasLN.mostrarAulasQueEmpiecenPor("A");
		for (Aula aula : mostrarAulasQueEmpiecenPor) {
			System.out.println(aula.getId());
		}
	}
}

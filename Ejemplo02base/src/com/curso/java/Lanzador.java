package com.curso.java;

import com.curso.java.model.Client;

public class Lanzador {
	public static void main(String[] args) {
		Client myClient1 = new Client();
		Client.mostrarNombre("hoola");
		myClient1 = null;
		System.gc();
		//myClient1.mostrarNombre();
		String diaDeLaSemana = "Sabado";
		switch (diaDeLaSemana) {
		case "Lunes":
			System.out.println("Inicio de semana");
			break;
		case "Martes":
			System.out.println("Hoy martes!");
			break;
		case "Miercoles":
		case "Jueves":
			System.out.print("Es el nuevo viernes");
			break;
		case "Viernes":
			System.out.println("De copazas!!");
			break;
		case "Sabado":
			System.out.print("Descansa ");
		case "Domingo":
			System.out.println("Capullo!");
			break;
		default:
			System.out.println("No valido : " + diaDeLaSemana);
			break;
		}
	}
}

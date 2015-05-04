package com.curso.java;

public class Ejemplo02AutoCloseableMain {

	public static void main(String[] args) 
			throws Exception {
		try(Ejempo02AutoCloseable gestorTareas = 
				new Ejempo02AutoCloseable()){
			gestorTareas.hazAlgoVago();
		}

	}

}

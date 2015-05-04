package com.curso.java;

public class Ejempo02AutoCloseable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Connection closed!");
		
	}
	public void hazAlgoVago(){
		System.out.println("Haciendo algo!!!");
	}

}

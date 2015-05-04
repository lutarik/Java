package com.curso.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo01ExceptionJava7 {

	public static void main(String[] args) {
		try {
			uno();
			System.out.println("connection closed!");
		} catch (FileNotFoundException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
		}finally{
			try{
				System.out.println("resultset closed!");
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("statement closed!");
			System.out.println("connection closed!");
		}
		System.out.println("FIN");
	}
	private static void uno() throws FileNotFoundException{
		dos();
	}
	private static void dos() throws FileNotFoundException{
			tres();
		}
	private static void tres() throws FileNotFoundException{
		cuatro();
	}
	private static void cuatro() throws FileNotFoundException{
		cinco();
	}
	private static void cinco() throws FileNotFoundException{
		String nombre = null;
		nombre.length();
		File fichero = new File("c:/miFichero.txt");
		FileReader reader = new FileReader(fichero);
		BufferedReader br =  new BufferedReader(reader);
	}
}

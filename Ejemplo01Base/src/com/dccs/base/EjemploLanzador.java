package com.dccs.base;

import com.dccs.base.model.Cliente;

public class EjemploLanzador {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.setNombre("Luis");
		Cliente.saludarComoCliente();
	}
}

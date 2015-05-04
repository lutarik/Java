package com.curso.java.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.curso.java.model.Aula;

public class AulaMapDAOImpl implements IAulaDAO{

	private static Map<String,Aula> almacenDeAulas;
	
	static{
		almacenDeAulas = new HashMap<String, Aula>();
	}
	
	@Override
	public void createAula(Aula aula) {
		almacenDeAulas.put(aula.getId(),aula);
	}

	@Override
	public Aula readAula(String id) {
		
		return almacenDeAulas.get(id);
	}

	@Override
	public Collection<Aula> readAulas() {
		return almacenDeAulas.values();
	}

	@Override
	public void updateAula(Aula aula) {
		
		createAula(aula);
	}

	@Override
	public void deleteAula(String id) {
		almacenDeAulas.remove(id);
	}
}

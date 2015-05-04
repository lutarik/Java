package com.curso.java.dao;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import com.curso.java.model.Aula;

public class AulaListDAOImpl implements IAulaDAO{

	private static List<Aula> almacenDeAulas;
	
	static{
		almacenDeAulas = new LinkedList<>();
	}
	
	@Override
	public void createAula(Aula aula) {
		almacenDeAulas.add(aula);
	}

	@Override
	public Aula readAula(String id) {
		int size = almacenDeAulas.size();
		for (int i = 0; i < size; i++) {
			Aula aula = almacenDeAulas.get(i);
			if(aula.getId() == id){
				return aula;
			}
		}
		Iterator<Aula> iterador = almacenDeAulas.iterator();
		while(iterador.hasNext()){
			Aula aula = iterador.next();
			if(aula.getId() == id){
				return aula;
			}
		}
		for (Aula aula : almacenDeAulas) {
			if(aula.getId() == id){
				return aula;
			}
		}
		return null;
	}

	@Override
	public Collection<Aula> readAulas() {
		return almacenDeAulas;
	}

	@Override
	public void updateAula(Aula aula) {
		
		int size = almacenDeAulas.size();
		for (int i = 0; i < size; i++) {
			Aula aulaActual = almacenDeAulas.get(i);
			if(aulaActual.getId() == aula.getId()){
				almacenDeAulas.set(i, aula);
			}
		}
	}

	@Override
	public void deleteAula(String id) {
		int size = almacenDeAulas.size();
		for (int i = 0; i < size; i++) {
			Aula aula = almacenDeAulas.get(i);
			if(aula.getId() == id){
				almacenDeAulas.remove(i);
			}
		}
		
	}
	static void agregarElemento(Collection<String> miDato,String elemento){
		miDato.add(elemento);
	}
	public static void main(String[] args) {
		LinkedHashSet<String> miAlmacen = new LinkedHashSet<>();
		
		agregarElemento(miAlmacen,"Luis");
		agregarElemento(miAlmacen,"Victor");
		agregarElemento(miAlmacen,"Alberto");
		agregarElemento(miAlmacen,"Maria");
		agregarElemento(miAlmacen,"Luis");
		System.out.println(miAlmacen.size());
		System.out.println(miAlmacen);
		//((ArrayList)miAlmacen).get(1);

		
	}
}

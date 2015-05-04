package com.curso.java.negocio;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.curso.java.dao.IAulaDAO;
import com.curso.java.model.Aula;

public class GestionAulasLN {
	
	private IAulaDAO miDao;
	
	public IAulaDAO getMiDao() {
		return miDao;
	}
	public void setMiDao(IAulaDAO miDao) {
		this.miDao = miDao;
	}
	
	public void darDeAltaAulas(Aula[] aulas){
		for (int i = 0; i < aulas.length; i++) {
			Aula aula = aulas[i];
			miDao.createAula(aula);
		}
	}
	public Set<Aula> mostrarAulasQueEmpiecenPor(String nombre){
		 Set<Aula> listaDeAulasQueCumplen = new HashSet<>();
		 Collection<Aula> readAulas = miDao.readAulas();
		 for (Aula aula : readAulas) {
			if(aula.getId().startsWith(nombre)){
				listaDeAulasQueCumplen.add(aula);
			}
		}
		 return listaDeAulasQueCumplen;
	}
	public Set<Aula> mostrarAulasConMasDeNumeroDePuestosDeAlumnos(Integer numeroDePuestosDeAlumnos){
		Set<Aula> listaDeAulasQueCumplen = new HashSet<>();
		 Collection<Aula> readAulas = miDao.readAulas();
		 for (Aula aula : readAulas) {
			if(aula.getPuestosDeAlumnos().size() > numeroDePuestosDeAlumnos){
				listaDeAulasQueCumplen.add(aula);
			}
		}
		 return listaDeAulasQueCumplen;
	}
}

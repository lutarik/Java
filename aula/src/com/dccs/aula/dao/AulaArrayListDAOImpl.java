package com.dccs.aula.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.dccs.aula.model.Aula;

public class AulaArrayListDAOImpl implements IAulasDAO {

	private static List<Aula> listaAulas=new ArrayList<>();
	
	@Override
	public void saveAula(Aula aula) {
		listaAulas.add(aula);
	}

	@Override
	public Aula readAula(String id) {
	
		for (int i = 0; i < listaAulas.size(); i++) {
			Aula aulaActual = listaAulas.get(i);
			if (aulaActual.getId().equals(id)){
				return aulaActual;
			}
		}

		return null;
	}

	@Override
	public void updateAula(Aula aula) {
		for (int i = 0; i < listaAulas.size(); i++) {
			Aula aulaActual=listaAulas.get(i);
			if (aulaActual.getId()==aula.getId()){
				listaAulas.set(i, aula);
			}
		}
	}

	@Override
	public void deleteAula(String id) {
		for (int i = 0; i < listaAulas.size(); i++) {
			Aula aulaActual=listaAulas.get(i);
			if (aulaActual.getId()==id){
				listaAulas.remove(i);
			}
		}
	}

	@Override
	public Collection<Aula> readAulas() {
		return null;
	}

}

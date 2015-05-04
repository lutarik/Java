package com.dccs.aula.dao;

import java.util.Collection;

import com.dccs.aula.model.Aula;

public interface IAulasDAO {
	/**
	 * @param aula - Aula a guardar. No admite NULL!
	 * Dado el aula, se almacena la información.
	 * No devuelve nada. No hay forma de saber si se ha guardado o no
	 */
	void saveAula(Aula aula);
	
	Aula readAula(String id);
	
	void updateAula(Aula aula);
	
	void deleteAula(String id);
	
	Collection<Aula> readAulas();
}

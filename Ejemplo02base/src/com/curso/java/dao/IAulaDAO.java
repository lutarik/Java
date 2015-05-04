package com.curso.java.dao;

import java.util.Collection;

import com.curso.java.model.Aula;

public interface IAulaDAO {
	void createAula(Aula aula);
	Aula readAula(String id);
	Collection<Aula> readAulas();
	void updateAula(Aula aula);
	void deleteAula(String id);
}

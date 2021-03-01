package model.dao;

import java.util.ArrayList;

import model.entity.SalaEvento;

public class SalaEventoDao {
	
	private static ArrayList<SalaEvento> entities = new ArrayList<SalaEvento>();

	public void add(SalaEvento t) {
		entities.add(t);
	}

	public ArrayList<SalaEvento> getAll() {
		return entities;
	}

	public void delete(SalaEvento t) {
		entities.remove(t);
	}

	public void edit(SalaEvento t) {
		for (SalaEvento entity : entities)
			if (entity.getId() == t.getId()) {
				entity = t;
				break;
			}
	}

}

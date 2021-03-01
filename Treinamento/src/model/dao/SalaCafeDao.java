package model.dao;

import java.util.ArrayList;

import model.entity.SalaCafe;

public class SalaCafeDao {
	
	private static ArrayList<SalaCafe> entities = new ArrayList<SalaCafe>();

	public void add(SalaCafe t) {
		entities.add(t);
	}

	public ArrayList<SalaCafe> getAll() {
		return entities;
	}

	public void delete(SalaCafe t) {
		entities.remove(t);
	}

	public void edit(SalaCafe t) {
		for (SalaCafe entity : entities)
			if (entity.getId() == t.getId()) {
				entity = t;
				break;
			}
	}
	
}

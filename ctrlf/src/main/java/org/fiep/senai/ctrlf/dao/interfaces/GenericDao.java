package org.fiep.senai.ctrlf.dao.interfaces;

import java.util.List;

public interface GenericDao<T> {
	void save(T t);
	void remove(T t);
	void update(T t);
	T getById(Integer id);
	List<T> getAll();
}

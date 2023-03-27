package org.fiep.senai.ctrlf.service.interfaces;

import java.util.List;

public interface GenericService<T> {

	void save(T t);
	void remove(Integer id);
	void update(T t);
	T getById(Integer id);
	List<T> getAll();
}

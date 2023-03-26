package org.fiep.senai.ctrlf.service;

import java.util.List;

import org.fiep.senai.ctrlf.service.interfaces.GenericService;

public abstract class GenericServiceImpl<T> implements GenericService<T> {
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public T getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll(T t) {
		// TODO Auto-generated method stub
		return null;
	}
}

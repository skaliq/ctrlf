package org.fiep.senai.ctrlf.service;

import java.util.List;

import org.fiep.senai.ctrlf.dao.interfaces.GenericDao;
import org.fiep.senai.ctrlf.service.interfaces.GenericService;

public abstract class GenericServiceImpl<T> implements GenericService<T> {
	protected abstract GenericDao<T> getDao();
	
	@Override
	public void save(T t) {
		getDao().save(t);
	}

	@Override
	public void remove(T t) {
		getDao().remove(t);
	}

	@Override
	public void update(T t) {
		getDao().update(t);
	}

	@Override
	public T getById(Integer id) {
		return getDao().getById(id);
	}

	@Override
	public List<T> getAll(T t) {
		return getDao().getAll();
	}
}

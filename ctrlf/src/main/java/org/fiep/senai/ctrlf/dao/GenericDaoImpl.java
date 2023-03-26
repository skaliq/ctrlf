package org.fiep.senai.ctrlf.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.fiep.senai.ctrlf.dao.interfaces.GenericDao;
import org.fiep.senai.ctrlf.jpa.util.ConnectionUtil;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
	protected static final String PU = "ctrlfPU";
	protected static EntityManager em = null;
	public abstract Class<T> getEntityClass();
	public abstract String getClassName();
	
	public void save(T t) {
		setConnectionAngBegin();
		try {
			em.persist(t);
		} catch (Exception ex) {
			
		} finally {
			commitAndClose();
		}
	}

	public void remove(T t) {
		setConnectionAngBegin();
		try {
			em.remove(t);
		} catch (Exception ex) {
			
		} finally {
			commitAndClose();
		}
	}

	public void update(T t) {
		setConnectionAngBegin();
		try {
			em.merge(t);
		} catch (Exception ex) {
			
		} finally {
			commitAndClose();
		}
	}

	public T getById(Integer id) {
		setConnection();
		T entity = null;
		try {
			em.find(getEntityClass(), id);
		} catch (Exception ex) {
			
		} finally {
			close();
		}
		return entity;
	}

	public List<T> getAll() {
		setConnection();
		String sql = "SELECT t FROM " + getClassName() + " t";
		TypedQuery<T> tq = em.createQuery(sql, getEntityClass());
		List<T> list = new ArrayList<>(tq.getResultList());
		close();
		return list;
	}
	
	@Override
	public T getByField(String classProperty, String value) {
		setConnection();
		String query = "SELECT t FROM " + getClassName();
		query += " t WHERE t." + classProperty + " = '" + value + "'";
		TypedQuery<T> tq = em.createQuery(query, getEntityClass());
		T entity = null; 
		try {
			entity = tq.getSingleResult();
		} catch (NoResultException nre) {
			
		} finally {
			close();
		}
		return entity;
	}
	
	protected static void close() {
		if (em != null || !em.isOpen()) {
			em.close();
		}
		ConnectionUtil.close();
	}
	
	protected static void setConnection() {
		if (em == null || !em.isOpen() ) {
			em = ConnectionUtil.getEntityManager(PU);
		}
	}
	
	protected static void commitAndClose() {
		em.getTransaction().commit();
		em.close();
		ConnectionUtil.close();
	}
	
	protected static void setConnectionAngBegin() {
		em = ConnectionUtil.getEntityManager(PU);
		em.getTransaction().begin();
	}

}

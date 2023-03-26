package org.fiep.senai.ctrlf.dao;

import org.fiep.senai.ctrlf.model.Login;

public class LoginDao extends GenericDaoImpl<Login> {
	
	public Boolean userExists(String user) {
		super.setConnection();
		String query = "SELECT l FROM " + getClassName();
		query += " l WHERE l.user = '" + user + "'";
		int size = em.createQuery(query).getResultList().size();
		super.close();
		return size > 0;
	}

	@Override
	public Class<Login> getEntityClass() {
		return Login.class;
	}

	@Override
	public String getClassName() {
		return "Login";
	}

}

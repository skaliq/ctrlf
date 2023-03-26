package org.fiep.senai.ctrlf.dao;

import org.fiep.senai.ctrlf.model.Login;

public class LoginDao extends GenericDaoImpl<Login> {

	@Override
	public Class<Login> getEntityClass() {
		return Login.class;
	}

	@Override
	public String getClassName() {
		return "Login";
	}

}

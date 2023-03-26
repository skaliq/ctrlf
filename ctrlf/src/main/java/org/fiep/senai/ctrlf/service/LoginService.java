package org.fiep.senai.ctrlf.service;

import org.fiep.senai.ctrlf.dao.LoginDao;
import org.fiep.senai.ctrlf.dao.interfaces.GenericDao;
import org.fiep.senai.ctrlf.model.Login;

public class LoginService extends GenericServiceImpl<Login> {

	@Override
	protected GenericDao<Login> getDao() {
		return new LoginDao();
	}

	public boolean userExists(String user) {
		Login login = getDao().getByField("user", user);
		return login != null;
	}

}

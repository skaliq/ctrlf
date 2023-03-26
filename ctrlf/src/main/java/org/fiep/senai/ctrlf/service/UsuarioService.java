package org.fiep.senai.ctrlf.service;

import org.fiep.senai.ctrlf.dao.UsuarioDao;
import org.fiep.senai.ctrlf.dao.interfaces.GenericDao;
import org.fiep.senai.ctrlf.model.Usuario;

public class UsuarioService extends GenericServiceImpl<Usuario> {

	@Override
	protected GenericDao<Usuario> getDao() {
		return new UsuarioDao();
	}

}

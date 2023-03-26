package org.fiep.senai.ctrlf.dao;

import org.fiep.senai.ctrlf.model.Usuario;

public class UsuarioDao extends GenericDaoImpl<Usuario> {

	@Override
	public Class<Usuario> getEntityClass() {
		return Usuario.class;
	}

	@Override
	public String getClassName() {
		return "Usuario";
	}

}

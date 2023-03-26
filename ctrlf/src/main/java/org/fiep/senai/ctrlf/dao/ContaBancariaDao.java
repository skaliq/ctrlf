package org.fiep.senai.ctrlf.dao;

import org.fiep.senai.ctrlf.model.ContaBancaria;

public class ContaBancariaDao extends GenericDaoImpl<ContaBancaria> {

	@Override
	public Class<ContaBancaria> getEntityClass() {
		return ContaBancaria.class;
	}

	@Override
	public String getClassName() {
		return "ContaBancaria";
	}

}

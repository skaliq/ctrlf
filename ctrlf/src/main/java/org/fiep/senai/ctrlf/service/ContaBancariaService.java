package org.fiep.senai.ctrlf.service;

import org.fiep.senai.ctrlf.dao.ContaBancariaDao;
import org.fiep.senai.ctrlf.dao.interfaces.GenericDao;
import org.fiep.senai.ctrlf.model.ContaBancaria;

public class ContaBancariaService extends GenericServiceImpl<ContaBancaria> {

	@Override
	protected GenericDao<ContaBancaria> getDao() {
		return new ContaBancariaDao();
	}

}

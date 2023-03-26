package org.fiep.senai.ctrlf.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionUtil {
	private static EntityManagerFactory emf = null;

	public static EntityManager getEntityManager(String PU) {
		if (emf == null || !emf.isOpen()) {
			emf = Persistence.createEntityManagerFactory(PU);
		}
		return emf.createEntityManager();
	}
	
	public static void close() {
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}
}

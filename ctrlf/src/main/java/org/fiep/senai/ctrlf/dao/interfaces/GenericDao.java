package org.fiep.senai.ctrlf.dao.interfaces;

import java.util.List;

public interface GenericDao<T> {
	/**
	 * Persiste um objeto na base de dados
	 * @param t - o objeto a ser persistido
	 */
	void save(T t);
	/**
	 * remove um objeto na base de dados
	 * @param t - o objeto a ser removido
	 */
	void remove(T t);
	/**
	 * Atualiza um objeto na base de dados
	 * @param t - o objeto a ser atualizado
	 */
	void update(T t);
	/**
	 * Recupera um objeto da base de dados
	 * @param id - o id do objeto a ser recuperado
	 * @return - o objeto recuperado
	 */
	T getById(Integer id);
	/**
	 * Retorna todos os objetos de uma tabela na base de dados
	 * @return - uma lista de objetos recuperados
	 */
	List<T> getAll();
	/**
	 * Recupera um único objeto da base de dados
	 * @param classProperty - o nome da propriedade que representa o campo na base de dados
	 * @param value - o valor a ser pesquisado no campo
	 * @return - o objeto recuperado
	 */
	T getByField(String classProperty, String value);
}

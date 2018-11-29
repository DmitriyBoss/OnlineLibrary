package by.bsuir.library.dao;

import by.bsuir.library.bean.Entity;

/**
 * Public interface for Base interactions with database
 * @author Svetlana Reznichenko
 */
public interface BaseDao<T extends Entity> {
	
	/**
	 * Create row in a table
	 * @param T
	 */
	void create (T t);
	
	/**
	 * Get row from a table
	 * @param int
	 * @return T
	 */
	T read(int id);
	
	/**
	 * Update row in a table
	 * @param int
	 * @return T
	 */
	void update(T t);
	
	/**
	 * Delete row in a table
	 * @param int
	 */
	void delete(int id);

}

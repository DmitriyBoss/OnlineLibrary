package by.bsuir.library.dao;

import by.bsuir.library.bean.Author;

/**
 * Public interface for Author's interaction with database
 * @author Svetlana Reznichenko
 */
public interface AuthorDao extends BaseDao<Author>{
	
	/**
	 * Get author by his name
	 * @param String
	 * @return Author
	 */
	Author getAuthorByName(String name);

}

package by.bsuir.library.service;

import by.bsuir.library.bean.Author;

/**
 * Public interface for Author's service
 * @author Svetlana Reznichenko
 *
 */
public interface AuthorService {
	
	/** Get Author by name
	 * @param String
	 * @return Author 
	 */
	Author getAuthor(String name);
	/** Creates author
	 * @param Author 
	 */
	void createAuthor(Author author);
	/** Get Author Id by name
	 * @param String
	 * @return int 
	 */
	int getAuthorId(String name);

}

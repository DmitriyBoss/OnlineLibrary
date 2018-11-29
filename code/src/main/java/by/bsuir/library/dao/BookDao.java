package by.bsuir.library.dao;

import java.util.List;

import by.bsuir.library.bean.Book;

/**
 * Public interface for Book's interaction with database
 * @author Svetlana Reznichenko
 */
public interface BookDao extends BaseDao<Book>{
	
	/**
	 * Get all books
	 * @return List<Book>
	 */
	List <Book> readAll();
	
	/**
	 * Get books by title
	 * @return List<Book>
	 */
	List<Book> readByTitle(String title);
	
	/**
	 * Decrement book amount value with determine id
	 */
	void decrementBookAmount(int bookId);
	
	/**
	 * Increment book amount value with determine id
	 */
	void incrementBookAmount(int bookId);

}

package by.bsuir.library.service;

import java.util.List;

import by.bsuir.library.bean.Book;

/**
 * Public interface for Book's service
 * @author Svetlana Reznichenko
 *
 */
public interface BookService {
	
	/** Get all books
	 * @return List<Book>
	 */
	List<Book> getBookCatalog();
	/** Get found books
	 * @param String
	 * @return List<Book>
	 */
	List<Book> getFoundBook(String title);
	/** Creates new book
	 * @param Book
	 */
	void createBook(Book book);
	/** Delete book
	 * @param int
	 */
	void deleteBook(int id);
	/** Update book
	 * @param Book
	 */
	void updateBook(Book book);
	/** Decrement book's amount
	 * @param int
	 */
	void decrementBook(int bookId);
	/** Increment book's amount
	 * @param int
	 */
	void incrementBook(int bookId);
}

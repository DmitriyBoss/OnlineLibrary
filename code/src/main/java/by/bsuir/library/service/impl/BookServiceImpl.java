package by.bsuir.library.service.impl;

import java.util.List;

import by.bsuir.library.bean.Book;
import by.bsuir.library.dao.BookDao;
import by.bsuir.library.dao.impl.BookDaoMySqlImpl;
import by.bsuir.library.service.BookService;

/**
 * Public class for communication between controller and book dao 
 * @author Svetlana Reznichenko
 *
 */
public class BookServiceImpl implements BookService{
	
	/** private variable for connection to BookDaoMySqlImpl class*/
	private BookDao bookDao = new BookDaoMySqlImpl();

	@Override
	public List<Book> getBookCatalog() {
		return bookDao.readAll();
	}
	
	@Override
	public List<Book> getFoundBook(final String TITLE){
		return bookDao.readByTitle(TITLE);
	}

	@Override
	public void createBook(final Book BOOK) {
		bookDao.create(BOOK);
	}

	@Override
	public void deleteBook(final int ID) {
		bookDao.delete(ID);
	}

	@Override
	public void updateBook(final Book BOOK) {
		bookDao.update(BOOK);
	}
	
	@Override
	public void decrementBook(final int BOOK_ID) {
		bookDao.decrementBookAmount(BOOK_ID);
	}

	@Override
	public void incrementBook(final int BOOK_ID) {
		bookDao.incrementBookAmount(BOOK_ID);
		
	}

}

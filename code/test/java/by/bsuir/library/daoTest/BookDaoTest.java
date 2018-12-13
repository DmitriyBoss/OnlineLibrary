package by.bsuir.library.daoTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import by.bsuir.library.bean.Book;
import by.bsuir.library.dao.impl.BookDaoMySqlImpl;

public class BookDaoTest {
	
	private BookDaoMySqlImpl bookDao = new BookDaoMySqlImpl();
	
  @Test
  public void readByTitleTest() {
	  List<Book> foundBooks = new ArrayList<>();
	  Book book = new Book();
	  book.setId(2);
	  book.setName("Green Mile");
	  book.setAuthor("Stephen King");
	  foundBooks.add(book);
	  assertEquals(foundBooks, bookDao.readByTitle("Green"));
  }
  
}

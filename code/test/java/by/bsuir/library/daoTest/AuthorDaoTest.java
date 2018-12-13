package by.bsuir.library.daoTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.bsuir.library.bean.Author;
import by.bsuir.library.dao.impl.AuthorDaoMySqlImpl;

public class AuthorDaoTest {
	
	private AuthorDaoMySqlImpl authorDao = new AuthorDaoMySqlImpl();
	
	
  @Test
  public void getAuthorByNameTest() {
	  assertEquals(new Author(2, "Lev Tolstoy"), authorDao.getAuthorByName("Lev Tolstoy"));
  }
}

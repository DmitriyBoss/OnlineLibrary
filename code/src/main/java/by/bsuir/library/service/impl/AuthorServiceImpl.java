package by.bsuir.library.service.impl;

import by.bsuir.library.bean.Author;
import by.bsuir.library.dao.AuthorDao;
import by.bsuir.library.dao.impl.AuthorDaoMySqlImpl;
import by.bsuir.library.service.AuthorService;

/**
 * Public class for communication between controller and author dao 
 * @author Svetlana Reznichenko
 *
 */
public class AuthorServiceImpl implements AuthorService{

	/** private variable for connection to AuthorDaoMySqlImpl class*/
	transient private AuthorDao authorDao = new AuthorDaoMySqlImpl();
	
	@Override
	public Author getAuthor(final String NAME) {
		return authorDao.getAuthorByName(NAME);
	}

	@Override
	public void createAuthor(final Author AUTHOR) {
		authorDao.create(AUTHOR);
	}

	@Override
	public int getAuthorId(final String NAME) {
		return authorDao.getAuthorByName(NAME).getId();
	}
	
	

}

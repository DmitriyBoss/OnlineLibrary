package by.bsuir.library.service.impl;

import java.util.List;

import by.bsuir.library.bean.User;
import by.bsuir.library.dao.UserDao;
import by.bsuir.library.dao.impl.UserDaoMySqlImpl;
import by.bsuir.library.service.UserService;

/**
 * Public class for communication between controller and user dao 
 * @author Svetlana Reznichenko
 *
 */
public class UserServiceImpl implements UserService{
	
	/** private variable for connection to UserDaoMySqlImpl class*/
	private UserDao userDao = new UserDaoMySqlImpl();

	@Override
	public User authorizeUser(final String LOGIN, final String PASS) {
		
		User user = new User(LOGIN, PASS);
		return userDao.readUser(user);
	}

	@Override
	public boolean checkRegistration(final User USER) {
		if(userDao.readUserByLogin(USER) == null) {
			userDao.create(USER);
			return true;
		}
		return false;
	}

	@Override
	public List<User> getUserList() {
		return userDao.readAll();
	}

}

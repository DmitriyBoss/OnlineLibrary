package by.bsuir.library.dao;

import java.util.List;

import by.bsuir.library.bean.User;

/**
 * Public interface for User's interaction with database
 * @author Svetlana Reznichenko
 */
public interface UserDao extends BaseDao<User>{
	
	/**
	 * Get all users
	 * @return List<User>
	 */
	List<User> readAll();
	
	/**
	 * Get user by object User
	 * @param User
	 * @return User
	 */
	User readUser(User user);
	
	/**
	 * Get user by his login
	 * @param User
	 * @return User
	 */
	User readUserByLogin(User userIn);

}

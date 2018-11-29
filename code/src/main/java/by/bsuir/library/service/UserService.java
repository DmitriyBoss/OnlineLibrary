package by.bsuir.library.service;

import java.util.List;

import by.bsuir.library.bean.User;

/**
 * Public interface for User's service
 * @author Svetlana Reznichenko
 *
 */
public interface UserService {
	
	/** Validate user's input data for sign in
	 * @param String, String
	 * @return User
	 */
	User authorizeUser(String login, String pass);
	/** Validate user's input data for sign up
	 * @param User
	 * @return boolean
	 */
	boolean checkRegistration(User user);
	/** Get all users
	 * @return List<User>
	 */
	List<User> getUserList();

}

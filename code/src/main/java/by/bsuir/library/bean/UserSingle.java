package by.bsuir.library.bean;

/**
 * Entity singleton class for user id
 * @author Svetlana Reznichenko
 */

public class UserSingle {
	
	/** Static UserSingle variable for user's variable*/
	private static UserSingle user;
	/** Int variable for user's id*/
	public int id;
	
	/** Default constructor for UserSingle class*/
	private UserSingle() {
			
	}
	
	/** Constructor with arguments for class UserSingle*/
	public UserSingle(final int ID) {
		this.id = ID;	
	}
	
	/** Returns current UserSingle object*/
	public static UserSingle getUser() {
		if(user == null) {
			user = new UserSingle();
		}
		return user;
	}
}

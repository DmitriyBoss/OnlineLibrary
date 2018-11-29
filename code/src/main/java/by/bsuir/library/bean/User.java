package by.bsuir.library.bean;

/**
 * Entity class for user
 * @author Svetlana Reznichenko
 */

public class User extends Entity{
	
	/** String variable for name */
	private String name;
	/** String variable for surname */
    private String surname;
    /** String variable for email */
    private String email;
    /** String variable for login */
    private String login;
    /** String variable for password */
    private String password;
    /** Int variable for role */
    private int role;

    /** Default constructor for class User*/
    public User(){
    	super();
    }

    /** Constructor with parameters for class User */
    public User(final String NAME, final String SURNAME, final String EMAIL, final String LOGIN, final String PASSWORD, final int ROLE) {
        this.name = NAME;
        this.surname = SURNAME;
        this.email = EMAIL;
        this.login = LOGIN;
        this.password = PASSWORD;
        this.role = ROLE;
    }

    /** Constructor with parameters for class User */
    public User(final String LOGIN, final String PASSWORD) {
    	super();
        this.login = LOGIN;
        this.password = PASSWORD;
    }

    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    public void setName(final String NAME) {
        this.name = NAME;
    }

    public void setSurname(final String SURNAME) {
        this.surname = SURNAME;
    }

    public void setEmail(final String EMAIL) {
        this.email = EMAIL;
    }

    public void setLogin(final String LOGIN) {
        this.login = LOGIN;
    }

    public void setPassword(final String PASSWORD) {
        this.password = PASSWORD;
    }

    public void setRole(final int ROLE) {
        this.role = ROLE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + role;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object OBJ) {
        if (this == OBJ) {
        	return true;
        }
        if (!super.equals(OBJ)) {
        	return false;
        }
        if (getClass() != OBJ.getClass()) {
        	return false;
        }
        final User OTHER = (User) OBJ;
        if (login == null) {
            if (OTHER.login != null) {
            	return false;
            }
        } else if (!login.equals(OTHER.login)) {
        	return false;
        }
        if (password == null) {
            if (OTHER.password != null) {
            	return false;
            }
        } else if (!password.equals(OTHER.password)) {
        	return false;
        }
        if (name == null) {
            if (OTHER.name != null) {
            	return false;
            }
        } else if (!name.equals(OTHER.name)) {
        	return false;
        }
        if (surname == null) {
            if (OTHER.surname != null) {
            	return false;
            }
        } else if (!surname.equals(OTHER.surname)) {
        	return false;
        }
        if (email == null) {
            if (OTHER.email != null) {
            	return false;
            }
        } else if (!email.equals(OTHER.email)) {
        	return false;
        }
        if (role != OTHER.role) {
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "name: " + name + "; surname: " + surname + "; email: " + email + "; login: " + login + "; password: " + password + "; role: " + role;
    }
}

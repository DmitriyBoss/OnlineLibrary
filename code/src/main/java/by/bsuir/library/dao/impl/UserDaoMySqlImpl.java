package by.bsuir.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.bsuir.library.bean.User;
import by.bsuir.library.dao.UserDao;

/**
 * Public class for User's interaction with database
 * @author Svetlana Reznichenko
 */
public class UserDaoMySqlImpl extends AbstractDaoMySqlImpl implements UserDao{
	
	/** private variable for sql user insert */
	private static final String SQL_INSERT_USER = "INSERT INTO user(name, surname, email, login, password, role) values ( ?, ?, ?, ?, ?, ?)";
	/** private variable for sql user select */
    private static final String SQL_SELECT_USER = "SELECT id, name, surname, email, login, password, role FROM user WHERE login = ? and password = ?";
    /** private variable for sql user select by his login */
    private static final String SQL_SELECT_USER_LOGIN = "SELECT id, name, surname, email, login, password, role FROM user WHERE login = ?";
    /** private variable for sql all users select */
    private static final String SQL_SELECT_USER_ALL = "SELECT id, name, surname, email, login, password, role FROM user WHERE role = 0";

    @Override
    public List<User> readAll() {

        List<User> users = new ArrayList<User>();
        try {
            Connection con = wcn.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL_SELECT_USER_ALL);
            while (rs.next()) {
                users.add(createUser(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * Set user's fields from ResultSet
     * @param ResultSet
     * @return User
     * @throws SQLException
     */
    public User createUser(final ResultSet RS) throws SQLException {
        User user = new User();
        user.setId(RS.getInt(SQL_ID));
        user.setName(RS.getString(SQL_NAME));
        user.setSurname(RS.getString(SQL_USER_SURNAME));
        user.setEmail(RS.getString("email"));
        user.setLogin(RS.getString(SQL_USER_LOGIN));
        user.setPassword(RS.getString(SQL_USER_PASSWORD));
        user.setRole(RS.getInt(SQL_USER_ROLE));
        return user;
    }
    
    @Override
    public User readUserByLogin(final User USER_IN) {
        User user = null;
        try {
            Connection con = wcn.getConnection();
            PreparedStatement ps = con.prepareStatement(SQL_SELECT_USER_LOGIN);
            ps.setString(1, USER_IN.getLogin());        
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                user = createUser(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User readUser(final User USER_ID) {
        User user = null;
        try {
            Connection con = wcn.getConnection();
            PreparedStatement ps = con.prepareStatement(SQL_SELECT_USER);
            ps.setString(1, USER_ID.getLogin());
            ps.setString(2, USER_ID.getPassword());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                user = createUser(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void create(final User USER) {
    	try {
            Connection con = wcn.getConnection();
            PreparedStatement ps = con.prepareStatement(SQL_INSERT_USER);
            ps.setString(1, USER.getName());
            ps.setString(2, USER.getSurname());
            ps.setString(3, USER.getEmail());
            ps.setString(4, USER.getLogin());
            ps.setString(5, USER.getPassword());
            ps.setString(6, "0");
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User read(final int ID) {
        return null;
    }

    @Override
    public void update(final User USER) {

    }

    @Override
    public void delete(final int ID) {

    }

}

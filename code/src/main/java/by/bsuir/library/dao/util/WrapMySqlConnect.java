package by.bsuir.library.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Public class for connecting to database
 * @author Svetlana Reznichenko
 *
 */
public class WrapMySqlConnect implements AutoCloseable{
	
	/** private variable for connection */
	private transient Connection con;
	/** private variable for URL string */
	private transient final static String URL = "jdbc:mysql://localhost/librarydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	/** private variable for user string */
	private transient final static String USER = "root";
	/** private variable for password string */
	private transient final static String PASSWORD = "root";
	/** private variable for string */
	private transient final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	/**
	 * Get connection to database
	 * @return Connection
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException{
		
		
		try {
			Class.forName(DRIVER).newInstance();
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch(ClassNotFoundException e) {
			throw new SQLException("Driver not loaded", e);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void close() throws Exception {
		con.close();
		
	}

}

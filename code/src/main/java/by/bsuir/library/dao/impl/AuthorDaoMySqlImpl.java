package by.bsuir.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.bsuir.library.bean.Author;
import by.bsuir.library.dao.AuthorDao;

/**
 * Public class for Author's interaction with database
 * @author Svetlana Reznichenko
 */
public class AuthorDaoMySqlImpl extends AbstractDaoMySqlImpl implements AuthorDao{
	
	/** private variable for sql select string */
	private static final String SQL_SELECT_AUTHOR = "SELECT * FROM author WHERE name = ?";
	/** private variable for sql insert string */
	private static final String SQL_AUTHOR_INSERT = "insert into author(name, birth_date) values (?, ?)";
	/** protected variable for sql Connection */
	protected transient Connection con;

	@Override
	public void create(final Author AUTHOR) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_AUTHOR_INSERT);
			ps.setString(1, AUTHOR.getName());
			ps.setString(2,  "14011999");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Author read(final int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(final Author AUTHOR) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(final int ID) {
		// TODO Auto-generated method stub
		
	}
	
	private Author createAuthor(final ResultSet RS) throws SQLException {
		Author author = new Author();
		author.setId(RS.getInt("id"));
		author.setName(RS.getString("name"));
		return author;
	}

	@Override
	public Author getAuthorByName(final String NAME) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_AUTHOR);
			ps.setString(1, NAME);
			ResultSet rs = ps.executeQuery();
			if(!rs.isBeforeFirst()) {
				return null;
			}else {
				rs.next();
				return createAuthor(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}

package by.bsuir.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.bsuir.library.bean.Booking;
import by.bsuir.library.dao.BookingDao;

/**
 * Public class for Booking's interaction with database
 * @author Svetlana Reznichenko
 */
public class BookingDaoMySqlImpl extends AbstractDaoMySqlImpl implements BookingDao{
	
	/** private variable for sql booking read by user id */
	private static final String SQL_BOOKING_READ_BY_USER_ID = "SELECT COUNT(*) from booking where is_approved != 0 and user_id = ?";
	/** private variable for sql booking insert */
	private static final String SQL_BOOKING_INSERT = "INSERT into booking(date_booking, user_id, book_id, is_approved) values (?, ?, ?, ?)";
	/** private variable for sql booking delete */
	private static final String SQL_BOOKING_DELETE = "DELETE FROM booking WHERE id = ?";
	/** private variable for sql booking select by user id */
	private static final String SQL_SELECT_BOOKINGS_BY_USER_ID = "SELECT librarydb.booking.id, librarydb.booking.date_booking, librarydb.book.title\r\n" + 
			"FROM librarydb.booking\r\n" + 
			"INNER JOIN librarydb.book \r\n" + 
			"ON librarydb.booking.book_id = librarydb.book.id  \r\n" + 
			"WHERE librarydb.booking.is_approved = 1\r\n" + 
			"OR librarydb.booking.is_approved = 3\r\n" + 
			"AND librarydb.booking.user_id = ?";
	/** private variable for sql booking select by book id */
	private static final String SQL_SELECT_BOOK_ID = "SELECT librarydb.booking.book_id FROM librarydb.booking WHERE librarydb.booking.id = ?";
	/** private variable for sql booking select check */
	private static final String SQL_SELECT_CHECK = "SELECT librarydb.booking.id FROM librarydb.booking WHERE librarydb.booking.book_id = ?";
	/** private variable for sql select new bookings */
	private static final String SQL_SELECT_NEW_BOOKINGS = "SELECT librarydb.booking.id, librarydb.booking.date_booking, librarydb.book.title, librarydb.user.name, librarydb.user.surname\r\n" + 
			"FROM librarydb.booking\r\n" + 
			"INNER JOIN librarydb.user\r\n" + 
			"ON librarydb.booking.user_id = librarydb.user.id\r\n" + 
			"INNER JOIN librarydb.book\r\n" + 
			"ON librarydb.booking.book_id = librarydb.book.id\r\n" + 
			"WHERE librarydb.booking.is_approved = 3";
	/** private variable for sql select active booking*/
	private static final String SQL_SELECT_ACTIVE_BOOKINGS = "SELECT librarydb.booking.id, librarydb.booking.date_booking, librarydb.book.title, librarydb.user.name, librarydb.user.surname\r\n" + 
			"FROM librarydb.booking\r\n" + 
			"INNER JOIN librarydb.user\r\n" + 
			"ON librarydb.booking.user_id = librarydb.user.id\r\n" + 
			"INNER JOIN librarydb.book\r\n" + 
			"ON librarydb.booking.book_id = librarydb.book.id\r\n" + 
			"WHERE librarydb.booking.is_approved = 1";
	/** private variable for sql booking update */
	private static final String SQL_BOOKING_UPDATE = "UPDATE booking SET is_approved = 1 where id = ?";
	/** private variable for sql booking update reject */
	private static final String SQL_BOOKING_UPDATE_REJECT = "UPDATE booking SET is_approved = 0 where id = ?";
	/** protected variable for Connection */
	protected transient Connection con;

	@Override
	public void create(final Booking BOOKING) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOKING_INSERT);
			ps.setString(1, BOOKING.getDateBooking());
			ps.setInt(2, BOOKING.getUserId());
			ps.setInt(3, BOOKING.getBookId());
			ps.setInt(4, 3);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Booking read(final int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(final Booking T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(final int ID) {

		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOKING_DELETE);
			ps.setInt(1, ID);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	
	@Override
	public int readBookingsAmount(final int ID) {
		int amount = 0;
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOKING_READ_BY_USER_ID);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				amount = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return amount;
	}
	
	private Booking createBooking(final ResultSet RS) throws SQLException {
		Booking booking = new Booking();
		booking.setId(RS.getInt("id"));
		booking.setDateBooking(RS.getString("date_booking"));
		booking.setBook(RS.getString("title"));
		return booking;
	}

	@Override
	public List<Booking> getBookingsByUserId(final int ID) {
		List<Booking> bookings = new ArrayList<>();
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_BOOKINGS_BY_USER_ID);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bookings.add(createBooking(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookings;
	}

	@Override
	public int getBookId(final int ID) {
		int bookId = 0;
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_BOOK_ID);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bookId = rs.getInt("book_id");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookId;
	}

	@Override
	public boolean ifBookIsFree(final int BOOK_ID) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_CHECK);
			ps.setInt(1, BOOK_ID);
			ResultSet rs = ps.executeQuery();
			if(!rs.isBeforeFirst()) {
				return true;
			} else {
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private Booking createFullBooking(final ResultSet RS) throws SQLException {
		Booking booking = createBooking(RS);
		booking.setName(RS.getString("name"));
		booking.setSurname(RS.getString("surname"));
		return booking;
	}

	@Override
	public List<Booking> readNewBookings() {
		List<Booking> bookings = new ArrayList<>();
		try {
			con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_NEW_BOOKINGS);
			while(rs.next()) {
				bookings.add(createFullBooking(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookings;
	}

	@Override
	public List<Booking> readActiveBookings() {
		List<Booking> bookings = new ArrayList<>();
		try {
			con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ACTIVE_BOOKINGS);
			while(rs.next()) {
				bookings.add(createFullBooking(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookings;
	}

	@Override
	public void updateAcceptById(final int ID) {
		try {
		con = wcn.getConnection();
		PreparedStatement ps = con.prepareStatement(SQL_BOOKING_UPDATE);
		ps.setInt(1, ID);
		ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	}

	@Override
	public void updateRejectById(final int ID) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOKING_UPDATE_REJECT);
			ps.setInt(1, ID);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}


}

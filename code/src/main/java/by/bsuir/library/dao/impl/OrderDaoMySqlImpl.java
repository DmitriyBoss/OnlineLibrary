package by.bsuir.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.bsuir.library.bean.Order;
import by.bsuir.library.dao.OrderDao;

/**
 * Public class for Order's interaction with database
 * @author Svetlana Reznichenko
 */
public class OrderDaoMySqlImpl extends AbstractDaoMySqlImpl implements OrderDao{
	
	/** private variable for sql select orders */
	private static final String SQL_SELECT_ORDERS = "SELECT librarydb.order.id, librarydb.order.date_take, librarydb.book.title\r\n" + 
			"FROM librarydb.order\r\n" + 
			"INNER JOIN librarydb.booking \r\n" + 
			"ON librarydb.order.booking_id = librarydb.booking.id\r\n" + 
			"INNER JOIN librarydb.book\r\n" + 
			"ON librarydb.booking.book_id = librarydb.book.id \r\n" + 
			"WHERE librarydb.order.is_returned = ?\r\n" + 
			"AND librarydb.booking.user_id = ?";
	/** private variable for sql select active orders */
	private static final String SQL_SELECT_ACTIVE_ORDERS = "SELECT librarydb.order.id, librarydb.order.date_take, librarydb.book.title, librarydb.user.name, librarydb.user.surname\r\n" + 
			"FROM librarydb.order\r\n" + 
			"INNER JOIN librarydb.booking\r\n" + 
			"ON librarydb.order.booking_id = librarydb.booking.id\r\n" + 
			"INNER JOIN librarydb.user\r\n" + 
			"ON librarydb.booking.user_id = librarydb.user.id\r\n" + 
			"INNER JOIN librarydb.book\r\n" + 
			"ON librarydb.booking.book_id = librarydb.book.id\r\n" + 
			"WHERE librarydb.order.is_returned = 0";
	/** private variable for sql orders' update */
	private static final String SQL_ORDER_UPDATE = "UPDATE librarydb.order SET librarydb.order.is_returned = 1 where id = ?";
	/** private variable for sql insert orders */
	private static final String SQL_ORDER_INSERT = "INSERT INTO librarydb.order(date_take, is_returned, booking_id) values (?, ?, ?)";
	/** protected variable for Connection */
	protected transient Connection con;

	@Override
	public void create(final Order ORDER) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_ORDER_INSERT);
			ps.setString(1, ORDER.getDateTaking());
			ps.setInt(2, ORDER.getIsReturned());
			ps.setInt(3, ORDER.getBookingId());
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
	public Order read(final int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(final Order T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(final int ID) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Set order's fields from ResultSet
	 * @param ResultSet
	 * @return Order
	 * @throws SQLException
	 */
	private Order createOrder(final ResultSet RS) throws SQLException {
		Order order = new Order();
		order.setId(RS.getInt("id"));
		order.setDateTaking(RS.getString("date_take"));
		order.setBook(RS.getString("title"));
		return order;
	}

	@Override
	public List<Order> getOrdersByUserId(final int USER_ID, final int ACTIVE) {
		List<Order> orders = new ArrayList<>();
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ORDERS);
			ps.setInt(1, ACTIVE);
			ps.setInt(2, USER_ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				orders.add(createOrder(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	/**
	 * Set order's fields from ResultSet
	 * @param ResultSet
	 * @return Order
	 * @throws SQLException
	 */
	private Order createFullOrder(final ResultSet RS) throws SQLException {
		Order order = createOrder(RS);
		order.setName(RS.getString("name"));
		order.setSurname(RS.getString("surname"));
		return order;
	}

	@Override
	public List<Order> getActiveOrders() {
		List<Order> orders = new ArrayList<>();
		try {
			con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ACTIVE_ORDERS);
			while(rs.next()) {
				orders.add(createFullOrder(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orders;
	}

	@Override
	public void updateOrderClose(final int ORDER_ID) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_ORDER_UPDATE);
			ps.setInt(1, ORDER_ID);
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

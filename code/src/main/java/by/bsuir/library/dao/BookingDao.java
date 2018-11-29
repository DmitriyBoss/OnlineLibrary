package by.bsuir.library.dao;

import java.util.List;

import by.bsuir.library.bean.Booking;

/**
 * Public interface for Booking's interaction with database
 * @author Svetlana Reznichenko
 */
public interface BookingDao extends BaseDao<Booking> {
	
	/**
	 * Get booking's amount
	 * @param int
	 * @return int
	 */
	int readBookingsAmount(int id);
	
	/**
	 * Get all bookings of particular user by his id
	 * @param int
	 * @return List<Booking>
	 */
	List<Booking> getBookingsByUserId (int id);
	
	/**
	 * Get book id by booking's id
	 * @param int
	 * @return int
	 */
	int getBookId(int id);
	
	/**
	 * Check if book is free
	 * @param int
	 * @return boolean
	 */
	boolean ifBookIsFree(int bookId);
	
	/**
	 * Get new bookings which are not seen by admin
	 * @return List<Booking>
	 */
	List<Booking> readNewBookings();
	
	/**
	 * Get active bookings
	 * @return List<Booking>
	 */
	List<Booking> readActiveBookings();
	
	/**
	 * Accept booking by it's id
	 * @param int
	 */
	void updateAcceptById(int id);
	
	/**
	 * Reject booking by it's id
	 * @param int
	 */
	void updateRejectById(int id);

}

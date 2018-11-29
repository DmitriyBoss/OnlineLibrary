package by.bsuir.library.service;

import java.util.List;

import by.bsuir.library.bean.Book;
import by.bsuir.library.bean.Booking;

/**
 * Public interface for Booking's service
 * @author Svetlana Reznichenko
 *
 */
public interface BookingService {
	
	/** Get all bookings
	 * @return List<Booking> 
	 */
	List<Booking> getBookingCatalog();
	/** Get Bookings by book's title
	 * @param String
	 * @return List<Booking> 
	 */
	List<Booking> getFoundBooking(String title);
	/** Checks if booking is available
	 * @param int
	 * @return boolean 
	 */
	boolean isBookingAvailable(int id);
	/** Create booking with user id and book id
	 * @param int, int
	 */
	void createBooking(int userId, int bookId);
	/** Delete booking by it's id
	 * @param int
	 */
	void deleteBooking(int id);
	/** Updates booking by book
	 * @param Book
	 */
	void updateBooking(Book book);
	/** Get Bookings by user id
	 * @param int
	 * @return List<Booking> 
	 */
	List<Booking> getBookingsByUserId(int id);
	/** Get book id by booking
	 * @param int
	 * @return int 
	 */
	int getBookIdByBooking (int id);
	/** Check if book is free (do not belong to anybody)
	 * @param int
	 * @return boolean 
	 */
	boolean checkIfBookIsFree(int bookId);
	/** Get new (unread) bookings
	 * @return List<Booking>
	 */
	List<Booking> getNewBookings();
	/** Get active bookings
	 * @return List<Booking>
	 */
	List<Booking> getActiveBookings();
	/** Accept booking by admin
	 * @param int
	 */
	void acceptBooking(int id);
	/** Reject booking by admin
	 * @param int
	 */
	void rejectBooking(int id);

}

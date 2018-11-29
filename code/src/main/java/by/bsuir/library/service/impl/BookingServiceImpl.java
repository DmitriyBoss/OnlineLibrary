package by.bsuir.library.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import by.bsuir.library.bean.Book;
import by.bsuir.library.bean.Booking;
import by.bsuir.library.dao.BookingDao;
import by.bsuir.library.dao.impl.BookingDaoMySqlImpl;
import by.bsuir.library.service.BookingService;

/**
 * Public class for communication between controller and booking dao 
 * @author Svetlana Reznichenko
 *
 */
public class BookingServiceImpl implements BookingService{
	
	/** private variable for connection to BookingDaoMySqlImpl class*/
	BookingDao bookingDao = new BookingDaoMySqlImpl();

	@Override
	public List<Booking> getBookingCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getFoundBooking(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBookingAvailable(final int ID) {
		return bookingDao.readBookingsAmount(ID) < 5;
		
	}

	@Override
	public void createBooking(final int USER_ID, final int BOOK_ID) {
		Date dateNow = new Date();
		SimpleDateFormat formatForDateNow = new SimpleDateFormat("ddMMyyyy");
		Booking booking = new Booking(formatForDateNow.format(dateNow), USER_ID, BOOK_ID, 3);
		bookingDao.create(booking);
		
		
	}

	@Override
	public void deleteBooking(final int ID) {
		bookingDao.delete(ID);
	}

	@Override
	public void updateBooking(final Book BOOK) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> getBookingsByUserId(final int ID) {
		return bookingDao.getBookingsByUserId(ID);
	}

	@Override
	public int getBookIdByBooking(final int ID) {
		return bookingDao.getBookId(ID);
	}

	@Override
	public boolean checkIfBookIsFree(final int BOOK_ID) {
		return bookingDao.ifBookIsFree(BOOK_ID);
	}

	@Override
	public List<Booking> getNewBookings() {
		return bookingDao.readNewBookings();
	}

	@Override
	public List<Booking> getActiveBookings() {
		return bookingDao.readActiveBookings();
	}

	@Override
	public void acceptBooking(final int ID) {
		bookingDao.updateAcceptById(ID);
		
	}

	@Override
	public void rejectBooking(final int ID) {
		bookingDao.updateRejectById(ID);
		
	}

}

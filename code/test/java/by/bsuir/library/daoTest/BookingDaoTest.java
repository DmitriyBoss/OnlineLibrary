package by.bsuir.library.daoTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import by.bsuir.library.bean.Booking;
import by.bsuir.library.dao.impl.BookingDaoMySqlImpl;

public class BookingDaoTest {
	
	private BookingDaoMySqlImpl bookingDao = new BookingDaoMySqlImpl();
	
  @Test
  public void readBookingsAmountTest() {
	  assertEquals(1, bookingDao.readBookingsAmount(8));
  }
  
  @Test
  public void getBookIdTest() {
	  assertEquals(2, bookingDao.getBookId(30));
  }
  
  @Test
  public void isBookIsFreeTest() {
	  assertEquals(false, bookingDao.ifBookIsFree(4));
  }
  
  @Test
  public void readNewBookingsTest() {
	  List<Booking> bookings = new ArrayList<>();
	  Booking booking = new Booking();
	  booking.setId(43);
	  booking.setDateBooking("29112018");
	  booking.setBook("Murder on the Orient Express");
	  booking.setName("Tihon");
	  booking.setSurname("Ananko");
	  bookings.add(booking);
	  assertEquals(bookings, bookingDao.readNewBookings());
  }
  
  @Test
  public void readActiveBookingsTest() {
	  List<Booking> bookings = new ArrayList<>();
	  Booking booking = new Booking();
	  booking.setId(42);
	  booking.setDateBooking("29112018");
	  booking.setBook("The Shining");
	  booking.setName("Diana");
	  booking.setSurname("Truhan");
	  bookings.add(booking);
	  assertEquals(bookings, bookingDao.readActiveBookings());
  }
  
}

package by.bsuir.library.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import by.bsuir.library.bean.Order;
import by.bsuir.library.dao.OrderDao;
import by.bsuir.library.dao.impl.OrderDaoMySqlImpl;
import by.bsuir.library.service.OrderService;

/**
 * Public class for communication between controller and order dao 
 * @author Svetlana Reznichenko
 *
 */
public class OrderServiceImpl implements OrderService{
	
	/** private variable for connection to OrderDaoMySqlImpl class*/
	OrderDao orderDao = new OrderDaoMySqlImpl();

	@Override
	public List<Order> getActiveOrders(final int userId) {
		
		return orderDao.getOrdersByUserId(userId, 0);
	}

	@Override
	public List<Order> getInactiveOrders(final int USER_ID) {
		return orderDao.getOrdersByUserId(USER_ID, 1);
	}

	@Override
	public List<Order> getAllActiveOrders() {
		return orderDao.getActiveOrders();
	}

	@Override
	public void closeOrder(final int ORDER_ID) {
		orderDao.updateOrderClose(ORDER_ID);
		
	}

	@Override
	public void createOrder(final int BOOK_ID) {
		Date dateNow = new Date();
		SimpleDateFormat formatForDateNow = new SimpleDateFormat("ddMMyyyy");
		Order order = new Order(formatForDateNow.format(dateNow), BOOK_ID, 0);
		orderDao.create(order);
		
	}
	
	

}

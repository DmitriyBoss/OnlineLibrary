package by.bsuir.library.service;

import java.util.List;

import by.bsuir.library.bean.Order;

/**
 * Public interface for Order's service
 * @author Svetlana Reznichenko
 *
 */
public interface OrderService {
	
	/** Get all active orders of particular user
	 * @param int
	 * @return List<Order>
	 */
	List<Order> getActiveOrders(int userId);
	/** Get all inactive orders of particular user
	 * @param int
	 * @return List<Order>
	 */
	List<Order> getInactiveOrders(int userId);
	/** Get all active orders
	 * @return List<Order>
	 */
	List<Order> getAllActiveOrders();
	/** Close particular order
	 * @param int
	 */
	void closeOrder(int orderId);
	/** Create order on perticular book
	 * @param int
	 */
	void createOrder(int bookId);

}

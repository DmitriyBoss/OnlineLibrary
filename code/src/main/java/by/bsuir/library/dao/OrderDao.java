package by.bsuir.library.dao;

import java.util.List;

import by.bsuir.library.bean.Order;

/**
 * Public interface for Order's interaction with database
 * @author Svetlana Reznichenko
 */
public interface OrderDao extends BaseDao <Order>{
	
	/**
	 * Get all orders of particular user by his id and activity value
	 * @param int
	 * @param int
	 * @return List<Order>
	 */
	List<Order> getOrdersByUserId (int userId, int active);
	
	/**
	 * Get all active orders
	 * @return List<Order>
	 */
	List<Order> getActiveOrders ();
	
	/**
	 * Close order by it's id
	 * @param int
	 */
	void updateOrderClose(int orderId);
	
}

package by.bsuir.library.daoTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import by.bsuir.library.bean.Order;
import by.bsuir.library.dao.impl.OrderDaoMySqlImpl;

public class OrderDaoTest {
	
	private OrderDaoMySqlImpl orderDao = new OrderDaoMySqlImpl();
	
  @Test
  public void getOrdersByUserIdTest() {
	  List<Order> orders = new ArrayList<>();
	  Order order = new Order();
	  order.setId(12);
	  order.setDateTaking("29112018");
	  order.setBook("Green Mile");
	  orders.add(order);
	  assertEquals(orders, orderDao.getOrdersByUserId(11, 0));
  }
  
  @Test
  public void getActiveOrdersTest() {
	  List<Order> orders = new ArrayList<>();
	  Order order = new Order();
	  order.setId(12);
	  order.setDateTaking("29112018");
	  order.setBook("Green Mile");
	  order.setName("Diana");
	  order.setSurname("Truhan");
	  orders.add(order);
	  assertEquals(orders, orderDao.getActiveOrders());
  }
}

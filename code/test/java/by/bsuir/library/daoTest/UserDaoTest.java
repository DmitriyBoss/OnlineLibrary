package by.bsuir.library.daoTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.bsuir.library.bean.User;
import by.bsuir.library.dao.impl.UserDaoMySqlImpl;

public class UserDaoTest {
	
	private UserDaoMySqlImpl userDao = new UserDaoMySqlImpl();
	
  @Test
  public void readUserByLoginTest() {
	  User user = new User();
	  user.setId(3);
	  user.setName("Диана");
	  user.setSurname("Пахомова");
	  user.setEmail("dianka_mras@gmail.com");
	  user.setLogin("dianka_mras");
	  user.setPassword("28041999");
	  user.setRole(0);
	  assertEquals(user, userDao.readUserByLogin(user));
  }
  
  @Test
  public void readUserTest() {
	  User user = new User();
	  user.setId(3);
	  user.setName("Диана");
	  user.setSurname("Пахомова");
	  user.setEmail("dianka_mras@gmail.com");
	  user.setLogin("dianka_mras");
	  user.setPassword("28041999");
	  user.setRole(0);
	  assertEquals(user, userDao.readUserByLogin(user));
  }
}

package daoImp;

import dao.UserDao;
import entity.User;

public class UserDaoImp2 implements UserDao {

	public User getUser() {
		User user = new User();
		user.setId("222222222");
		user.setName("loserWang");
		user.setAge(99);
		user.setPhone("10086");
		return user; 
	}

}

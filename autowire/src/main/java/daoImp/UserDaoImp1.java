package daoImp;

import dao.UserDao;
import entity.User;

public class UserDaoImp1 implements UserDao{
	
	public User getUser(){
		User user = new User();
		user.setId("11111");
		user.setName("loserStar");
		user.setAge(30);
		user.setPhone("13987725457");
		return user; 
	}
}

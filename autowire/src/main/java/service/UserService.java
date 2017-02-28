package service;

import dao.UserDao;
import entity.User;

public class UserService {
	private UserDao userDao;
	
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public User getUser() {
		return userDao.getUser();
	}
	
	
}

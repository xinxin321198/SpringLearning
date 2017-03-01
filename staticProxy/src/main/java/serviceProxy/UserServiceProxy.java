package serviceProxy;

import entity.User;
import service.UserService;

public class UserServiceProxy implements UserService {
	
	private UserService userService;
	


	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public User getUser() {
		System.out.println("-------------我代理了userSerivce，准备调用它的getUser方法");
		return userService.getUser();
	}

}

package serviceProxy;

import entity.User;
import service.UserService;

/**
 * userSerivce的静态代理类
 * author: loserStar
 * date: 2017年3月2日上午10:16:31
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
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

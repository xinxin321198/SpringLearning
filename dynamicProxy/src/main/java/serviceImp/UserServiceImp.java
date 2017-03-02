package serviceImp;

import entity.User;
import service.UserService;

public class UserServiceImp implements UserService {

	public User getUser() {
		System.out.println("生成了user对象");
		User user = new User();
		user.setId("11111");
		user.setName("loserStar");
		user.setAge(30);
		user.setPhone("13987725457");
		return user; 
	}

}

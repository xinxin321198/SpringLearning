package serviceImp;

import entity.User;
import service.UserService;

public class UserServiceImp2 implements UserService {

	public User getUser() {
		System.out.println("生成了user222222222对象");
		User user = new User();
		user.setId("2222222");
		user.setName("loserStar22222");
		user.setAge(1);
		user.setPhone("122222222222");
		return user; 
	}

}

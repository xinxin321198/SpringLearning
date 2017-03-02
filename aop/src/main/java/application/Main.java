package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

/**
 * 简单的动态代理的实现，AOP
 * author: loserStar
 * date: 2017年3月2日上午10:17:01
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.getUser();
	}

}

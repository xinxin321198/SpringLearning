package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.UserService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService)applicationContext.getBean("userService");
		User user = userService.getUser();
		System.out.println("userService依赖于userDao，通过名称去自动查找对应的bean进行装配（注意必须有所依赖的对象对应的set方法才行），spring自动把userDao初始化");
		System.out.println(user.getId()+" "+user.getName()+" "+user.getAge()+" "+user.getPhone());
	}

}

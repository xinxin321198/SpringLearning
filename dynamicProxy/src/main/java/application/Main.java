package application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import invocationHandler.logInvocationHandler;
import service.UserService;

/**
 * 简单的动态代理的实现
 * author: loserStar
 * date: 2017年3月2日上午10:17:01
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
public class Main {

	public static void main(String[] args) {
		//使用spring初始化一个需要被代理的对象
		UserService userService = (UserService)new ClassPathXmlApplicationContext("spring.xml").getBean("userService");
		
		//创建一个代理类处理程序类,记录打印log
		logInvocationHandler logInvocationHandler = new logInvocationHandler(userService);

		//把动态代理类转换为对应的接口类型
		UserService userServiceProxy = (UserService)logInvocationHandler.getProxy();
		userServiceProxy.getUser();
	}

}

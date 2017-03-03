package application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import invocationHandler.logInvocationHandler;
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
		//使用spring初始化一个需要被代理的对象
		UserService userService = (UserService)new ClassPathXmlApplicationContext("spring.xml").getBean("userService");
		
		//创建一个代理类处理程序类,记录打印log
		logInvocationHandler logInvocationHandler = new logInvocationHandler(userService);

		//把动态代理类转换为对应的接口类型
		UserService userServiceProxy = (UserService)logInvocationHandler.getProxy();
		userServiceProxy.getUser();
		
		
		//测试观察：把调用类生成的代理类的class字节码文件输出到硬盘上，然后用jd反编译工具反编译出来看源码,实际上就跟静态代理的调用机制一样，帮你生成了一个实现userService接口的类，并且在方法体里增加了附加操作
	}

}

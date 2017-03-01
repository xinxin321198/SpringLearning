package application;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import service.UserService;

public class Main {

	public static void main(String[] args) {
		//创建一个代理类处理程序类,记录打印log
		InvocationHandler invocationHandler = new InvocationHandler() {
			private UserService userService;
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("动态代理类记录日志，当前运行了方法："+method.getName());
				Object object = method.invoke(userService, args);
				return object;
			}
		};
		
		//通过代理类的静态方法，传入接口生成动态代理类
		Proxy proxy = (Proxy) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), UserService.class.getInterfaces(), invocationHandler);
		
		//把动态代理类转换为对应的接口类型、
		UserService userService = (UserService)proxy;
		userService.getUser();
	}

}

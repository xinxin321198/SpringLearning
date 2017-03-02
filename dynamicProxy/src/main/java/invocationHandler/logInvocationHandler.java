package invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import service.UserService;
import serviceImp.UserServiceImp;

/**
 * 
 * author: loserStar
 * date: 2017年3月2日上午9:38:41
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:自己实现一个log的的动态代理调用类
 */
public class logInvocationHandler implements InvocationHandler {
	
	//被调用的目标对象
	private Object target;
	
	
	
	/**
	 * 初始化将要调用的对象
	 * @param target
	 */
	public logInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	 /** 
     * 执行目标对象的方法 
     */  
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理类记录日志，当前运行了方法----before："+method.getName());
		Object object = method.invoke(target, args);
		System.out.println("动态代理类记录日志，当前运行了方法----after："+method.getName());
		return object;
	}
	
	/**
	 * 获得被调用对象的代理对象
	 * author: loserStar
	 * email:362527240@qq.com
	 * @return
	 */
	public Proxy getProxy(){
		//通过代理类的静态方法，传入接口生成对应的代理对象
		Proxy proxy = (Proxy) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
		return proxy;
	}

}

/**
 * author: loserStar
 * date: 2017年3月2日下午4:51:50
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * author: loserStar
 * date: 2017年3月2日下午4:51:50
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
public class AfterLog implements AfterReturningAdvice{

	
	/**
	 * 目标方法的后置通知
	 * arg0:返回值
	 * arg1:被调用的方法
	 * arg2:被调用的方法对象的参数
	 * arg3:被调用的方法对象的目标对象
	 */
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg3.getClass().getName()+"的方法"+arg1.getName()+"被执行,返回值是"+arg0);
		
	}

}

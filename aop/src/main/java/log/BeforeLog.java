/**
 * author: loserStar
 * date: 2017年3月2日下午4:49:01
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * author: loserStar
 * date: 2017年3月2日下午4:49:01
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
public class BeforeLog implements MethodBeforeAdvice{

	/**
	 * 目标的方法的后置通知
	 * arg0:被调用的方法的对象
	 * arg1：被调用的方法对象的参数
	 * arg2：被调用方法的目标对象
	 */
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(arg2.getClass().getName()+"的方法"+arg0.getName()+"被执行");
		
	}

}

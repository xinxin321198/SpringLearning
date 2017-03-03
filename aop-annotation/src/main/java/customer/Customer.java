/**
 * author: loserStar
 * date: 2017年3月3日上午9:32:34
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package customer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * author: loserStar
 * date: 2017年3月3日上午9:32:34
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */

@Aspect //表示一个切面类
public class Customer {
	
	/**
	 * 被调用之前执行
	 */
	@Before(value="execution(* serviceImp.*.*(..))")
	public void before(){
		System.out.println("--------------自定义的被调用之前执行");
	}
	
	/**
	 * 被调用之后执行
	 */
	@After(value="execution(* serviceImp.*.*(..))")
	public void after(){
		System.out.println("自定义的被调用之后执行+++++++++++++++++++");
	}
	
	/**
	 * 环绕执行，前后都执行
	 * @throws Throwable 
	 */
	@Around(value="execution(* serviceImp.*.*(..))")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("<-<-<-<-<-<-<-<-<-<-环绕前");
		System.out.println("连接点"+jp.getSignature());
		Object object = jp.proceed();//执行方法
		System.out.println("环绕后->->->->->->->->->->");
		return object;
	}
}

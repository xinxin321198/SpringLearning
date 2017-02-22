package simple.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello loserStar~~~~!!!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		//默认无参构造方法构造实例
		Hello hello = (Hello)applicationContext.getBean("hello");
		hello.say();
		
		//使用有参构造方法
		Hello hello1 = (Hello)applicationContext.getBean("hello1");
		hello1.say();
		
		//使用静态工厂构造
		Hello hello2 = (Hello)applicationContext.getBean("hello2");
		hello2.say();
		
		
		//使用动态工厂构造
		Hello hello3 = (Hello)applicationContext.getBean("hello3");
		hello3.say();
		
	}

}

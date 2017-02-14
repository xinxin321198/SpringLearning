package simple.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello loserStar~~~~!!!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = (Hello)applicationContext.getBean("hello");
		hello.say();
	}

}

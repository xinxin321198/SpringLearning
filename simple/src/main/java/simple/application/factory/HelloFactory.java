package simple.application.factory;

import simple.application.Hello;

public class HelloFactory {
	
	public static Hello getHello(String name){
		return new Hello(name);
	}
}

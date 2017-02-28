package factory;

import application.Hello;

public class HelloDynamicFactory {
	public Hello getHello(String name){
		return new Hello(name);
	}
}

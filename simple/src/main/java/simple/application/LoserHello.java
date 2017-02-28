package simple.application;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class LoserHello {
	
	private String string ;//用于常量注入和无参构造村塾
	private Hello hello;//bean注入
	private String[] names;//数组注入
	private List<String> list;//list注入
	private Map<String, Object> map;//map注入
	private Set<String> set;//set的注入
	private String isNull;//null注入
	private Properties properties;//properties注入



	public void setProperties(Properties properties) {
		this.properties = properties;
	}


	public void setIsNull(String isNull) {
		this.isNull = isNull;
	}


	public void setSet(Set<String> set) {
		this.set = set;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	public LoserHello() {
		super();
		this.string = "LoserHello无参构造方法";
	}
	
	public LoserHello(String name){
		super();
		this.string = name;
	}

	
	/**
	 * 方法校验注入的对象
	 */
	public void say() {
		System.out.println("this is LoserHello calss!~"+" 使用"+this.string);
		if (null!=hello) {
			System.out.println("bean注入：---------------");
			System.out.println("调用hello的say方法");
			hello.say();
		}
		if (null!=names) {
			System.out.println("数组注入：------------------");
			for (String string : names) {
				System.out.println(string);
			}
		}
		
		if (null!=list) {
			System.out.println("list注入：----------------");
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		if (null!=map) {
			System.out.println("map注入：---------------");
			System.out.println(map);
			Hello map3 = (Hello)map.get("map3");
			map3.say();
		}
		
		if (null!=set) {
			System.out.println("set注入：---------------");
			System.out.println(set);
		}
		if (null==isNull) {
			System.out.println("null注入：---------------");
		}
		if (null!=properties) {
			System.out.println("properties注入：----------------");
			System.out.println(properties);
		}
	}
}

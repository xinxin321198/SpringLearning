package simple.application;

public class LoserHello {
	
	private String string ;
	private Hello hello;
	


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

	public void say() {
		System.out.println("this is LoserHello calss!~"+" 使用"+this.string);
		if (null!=hello) {
			hello.say();
		}
	}
}

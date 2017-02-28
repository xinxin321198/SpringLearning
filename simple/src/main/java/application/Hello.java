package application;

public class Hello {
	
	private String string ;
	
	public Hello() {
		super();
		this.string = "无参构造方法";
	}
	
	public Hello(String name){
		super();
		this.string = name;
	}

	public void say() {
		System.out.println("this is hello calss!~"+" 使用"+this.string);
	}
}

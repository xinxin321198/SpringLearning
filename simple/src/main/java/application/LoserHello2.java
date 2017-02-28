package application;

/**
 * 用来测试p命名空间注入
 * @author loserStar
 *
 */
public class LoserHello2 {
	private String s1;
	private String s2;
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	public void say(){
		
		System.out.println("命名空间p注入：------------------");
		System.out.println(s1+"   "+s2);
	}
}

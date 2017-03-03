/**
 * author: loserStar
 * date: 2017年3月3日上午9:32:34
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package customer;

/**
 * author: loserStar
 * date: 2017年3月3日上午9:32:34
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
public class Customer {
	
	/**
	 * 被调用之前执行
	 */
	public void before(){
		System.out.println("《《《《《《《《《《《《《《《自定义的被调用之前执行");
	}
	
	/**
	 * 被调用之后执行
	 */
	public void after(){
		System.out.println("自定义的被调用之后执行》》》》》》》》》》》》》");
	}
}

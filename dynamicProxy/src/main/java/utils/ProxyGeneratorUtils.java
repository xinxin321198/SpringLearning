/**
 * author: loserStar
 * date: 2017年3月2日上午10:28:52
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import sun.misc.ProxyGenerator;  
import serviceImp.UserServiceImp;

/**
 * author: loserStar
 * date: 2017年3月2日上午10:28:52
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:代理类的生成工具
 */
public class ProxyGeneratorUtils {  
	  
    /** 
     * 
     * 把代理类的字节码写到硬盘上 
     * @param object 要生成代理类的调用类
     * @param path 保存路径 
     */  
    public static void writeProxyClassToHardDisk(Object object ,String path) {  
        // 第一种方法，这种方式在刚才分析ProxyGenerator时已经知道了  
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);  
          
        // 第二种方法  
          
        // 获取代理类的字节码  
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy11", UserServiceImp.class.getInterfaces());  
          
        FileOutputStream out = null;  
          
        try {  
            out = new FileOutputStream(path);  
            out.write(classFile);  
            out.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                out.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  
  
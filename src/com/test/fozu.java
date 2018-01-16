/**
 * 
 */
package com.test;

import org.apache.commons.codec.binary.Base64;

import Decoder.BASE64Decoder;

/**
 * @Project:myfirst  
 * @Class:fozu 
 * @author 高希阳
 * @date 2017-6-22 下午3:32:33   
 * @version 1.0.0 
 */

public class fozu {

	/**
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法一：base64
	   String fozuStr = "ICAgICAgICAgICAgICAgICAgIF9vb09vb18KICAgICAgICAgICAgICAgICAgbzg4ODg4ODhvCiAgICAgICAgICAgICAgICAgIDg4IiAuICI4OAogICAgICAgICAgICAgICAgICAofCAtXy0gfCkKICAgICAgICAgICAgICAgICAgT1wgID0gIC9PCiAgICAgICAgICAgICAgIF9fX18vYC0tLSdcX19fXwogICAgICAgICAgICAgLicgIFxcfCAgICAgfC8vICBgLgogICAgICAgICAgICAvICBcXHx8fCAgOiAgfHx8Ly8gIFwKICAgICAgICAgICAvICBffHx8fHwgLTotIHx8fHx8LSAgXAogICAgICAgICAgIHwgICB8IFxcXCAgLSAgLy8vIHwgICB8CiAgICAgICAgICAgfCBcX3wgICcnXC0tLS8nJyAgfCAgIHwKICAgICAgICAgICBcICAuLVxfXyAgYC1gICBfX18vLS4gLwogICAgICAgICBfX19gLiAuJyAgLy0tLi0tXCAgYC4gLiBfXwogICAgICAuIiIgJzwgIGAuX19fXF88fD5fL19fXy4nICA+JyIiLgogICAgIHwgfCA6ICBgLSBcYC47YFwgXyAvYDsuYC8gLSBgIDogfCB8CiAgICAgXCAgXCBgLS4gICBcXyBfX1wgL19fIF8vICAgLi1gIC8gIC8KPT09PT09YC0uX19fX2AtLl9fX1xfX19fXy9fX18uLWBfX19fLi0nPT09PT09CiAgICAgICAgICAgICAgICAgICBgPS0tLT0nCl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXgogICAgICAgICAgICAgICAgIOS9m+elluS/neS9kSAgICAgICDmsLjml6BCVUc=";  
       byte[] decode = Base64.decodeBase64(fozuStr);  
       System.out.print("\n"+new String(decode)); 
       //方法二：string
       String fozu =   
               "                   _ooOoo_"+"\n"+  
               "                  o8888888o"+"\n"+  
               "                  88\" . \"88"+"\n"+  
               "                  (| -_- |)"+"\n"+  
               "                  O\\  =  /O"+"\n"+  
               "               ____/`---'\\____"+"\n"+  
               "             .'  \\\\|     |//  `."+"\n"+  
               "            /  \\\\|||  卍     |||//  \\"+"\n"+  
               "           /  _||||| -:- |||||-  \\"+"\n"+  
               "           |   | \\\\\\  -  /// |   |"+"\n"+  
               "           | \\_|  ''\\---/''  |   |"+"\n"+  
               "           \\  .-\\__  `-`  ___/-. /"+"\n"+  
               "         ___`. .'  /--.--\\  `. . __"+"\n"+  
               "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\"."+"\n"+  
               "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |"+"\n"+  
               "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /"+"\n"+  
               "======`-.____`-.___\\_____/___.-`____.-'======"+"\n"+  
               "                   `=---='"+"\n"+  
               "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"+  
               "                    佛祖保佑       永无BUG"+"\n";  
       System.out.println("\n"+fozu); 
	}

}

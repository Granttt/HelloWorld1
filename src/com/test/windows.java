/**
 * 
 */
package com.test;

/**
 * @Project:myfirst  
 * @Class:windows 
 * @author 高希阳
 * @date 2017-6-8 下午4:40:53   
 * @version 1.0.0 
 */

public class windows {

	/**
	 * 判断当前操作系统
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("os.name"));//操作系统的名称
		System.out.println(System.getProperty("os.name").toLowerCase());//操作系统的名称(字符串转换为小写)
		System.out.println(System.getProperty("file.separator"));//文件分隔符（在 UNIX 系统中是“/”）
		System.out.println( System.getProperty("os.version") );  //操作系统的版本
		System.out.println( System.getProperty("os.arch") );  //操作系统的架构
		System.out.println( System.getProperty("java.vendor.url") );  //Java 供应商的 URL
		    
		    String os = System.getProperty("os.name");  
		    if(os.toLowerCase().startsWith("win")){  
		      System.out.println(os + " can't gunzip");  
		    }  
		
	   String aString="asdfghjdkl";
	   System.out.println(remove(aString,"d",1));
		    
	}
	/**
	  * 
	  * @param s  要操作的字符串
	  * @param string  要删除的字符
	  * @param i  删除第几个
	  * @return
	  */
	 public static String remove(String s,String string,int i){
	  if(i==1){
	   int j=s.indexOf(string);
	   s=s.substring(0, j)+s.substring(j+1);
	   i--;
	   return s;
	  }else{
	   int j=s.indexOf(string);
	   i--;
	   return s.substring(0, j+1)+remove(s.substring(j+1), string, i);
	  }

	}
}

/**
 * 
 */
package com.test;

/**
 * @Project:myfirst  
 * @Class:substring 
 * @author 高希阳
 * @date 2017-6-12 下午12:35:12   
 * @version 1.0.0 
 */

public class substring {

	/**
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s ="商品评论-审核-处方药";
	        String s2=s.substring(s.lastIndexOf("-")+1);//处方药
	        System.out.println(s2);
	    int i=s.lastIndexOf("-")+1;//7
	        String s3= s.substring(0,s.lastIndexOf("-"));//商品评论-审核
	        System.out.println(s3);
	}

}

/**
 * 删除指定的字符串
 * @Project:myfirst  
 * @Class:StringDemo 
 * @author 高希阳
 * @date 2017-6-13 上午10:03:31   
 * @version 1.0.0
 */
class StringDemo{
	
	public static void main(String[] args) {
		String str="this is my original string";
	    String toDelete=" original";
	    
	    if(str.startsWith(toDelete))
	        str=str.substring(toDelete.length());
	    else
	    	if(str.endsWith(toDelete))
	    	     str=str.substring(0, str.length()-toDelete.length());
	    	else
	        {
	    		int index=str.indexOf(toDelete);
	    		if(index!=-1)
	    	     {
	    	      String str1=str.substring(0, index);
	    	      String str2=str.substring(index+toDelete.length());
	    	      str=str1+str2;
	    	     }
	    	     else
	    	      System.out.println("string "+toDelete+" not found");
	        }
	    System.out.println(str);
	}
	
}

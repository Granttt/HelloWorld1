/**
 * 
 */
package com.test;

/**
 * @Project:myfirst  
 * @Class:indexOf 
 * @author 高希阳
 * @date 2017-8-25 上午11:16:31   
 * @version 1.0.0 
 */

public class indexOf {

	/**
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "my name is xiaoye's chuanshou";
		 str=str.substring(6);// str＝str.substring(int  beginIndex);截取掉str从首字母起长度为beginIndex的字符串，将剩余字符串赋值给str；
		 System.out.println(str);
		 str=str.substring(0, 1);// 截取str中从beginIndex开始至endIndex结束时的字符串，并将其赋值给str;(包含beginIndex位置的值，但是不包含endIndex的值)
		 System.out.println(str);
		 String sr = "my name  is xiaoye's chuanshou";
		 String sx = "m";
		 int index=sr.indexOf(sx);//如果存在就会返回这个字符串开始出现的索引位置
		 System.out.println(index+"<<<<");
		 int index2 = sr.indexOf(sx, 3);//这个意思是从索引位置3开始，找sx=“is”的字符串，找到之后，同样返回字符串开始出现的索引位置
	     System.out.println(index2+"<<<<<");
	     String str2="<12453>123";
	     System.out.println(str2.indexOf("wwww"));//如果不包含字符串wwww，那么证明在整个索引中没有它的位置，返回卫-1
	     System.out.println(str2.substring(str2.indexOf("123")+1,9)+"<<<<<<");
	        //上面这段代码，首先str2.index("123")返回的是7，代表从第7位开始出现整个字符串
	        //加1，代表的意思是到索引位置8
	        //从索引位置8开始到9结束，因为subString是取头不取尾，所以subString(8,9)取出来的为2
	}
	
}


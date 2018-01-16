/**
 * 
 */
package com.test;

/**
 * @Project:myfirst  
 * @Class:Heart 
 * @author 高希阳
 * @date 2017-6-22 下午4:09:23   
 * @version 1.0.0 
 */

public class Heart {
	public static void main(String[] args) {
		heart(11,0.9,"love");
//		heartTwo(15,0.9,"爱","梁山伯","祝英台");
	}

	private static void heart(int r,double size,String req){
		size=1/(1.5*r*size);
		StringBuilder sb=new StringBuilder();
		for (int y = r; y > -r; y--,sb.append("\n"))
		for (int x = -2*r; x < 2*r; x++ ) {
		char msg=(req + req).charAt((x - y) % req.length() + req.length());
		sb.append((inHeart(size,x,y)?msg+ " " : " "));
		}
		System.err.println(sb.toString());
		}
//	private static void heartTwo(int r,double size,String center,String left,String right){
//		size=1/(1.5*r*size);
//		StringBuilder sb=new StringBuilder();
//		for (int y = r; y > -r; y--,sb.append("\n"))
//		for (int x = -2*r; x <4*r; x++ ) {
//		boolean isLeft=inHeart(size,x,y);
//		boolean isRight=inHeart(size,x-25,y-3);
//		//双空格
//		String req=null;
//		if(isLeft && isRight) req=center;
//		else if(isLeft) req=left;
//		else if (isRight) req=right;
//		if(req!=null) sb.append((req + req).charAt((x - y) % req.length() + req.length()));
//		else sb.append(" ");//双空格
//		}
//		System.err.println(sb.toString());
//		}
	
	
	
	private static boolean inHeart(double size,int x,int y){
		return Math.pow(Math.pow(x * size,2) + Math.pow(y * 2*size, 2) - 1, 3) - Math.pow(x * size, 2) * Math.pow(y * 2*size, 3) <= 0;
	}
	private static boolean line(int x,int y){
		return 4*y-x == 0;
	}
}

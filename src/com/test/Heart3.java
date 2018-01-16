/**
 * 
 */
package com.test;

/**
 * @Project:myfirst  
 * @Class:Heart3 
 * @author 高希阳
 * @date 2017-6-23 下午3:32:41   
 * @version 1.0.0 
 */

public class Heart3 {

	/**
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (double y = 1.5; y >= -1.5; y -= 0.1)
		 {
		  for (double x = -1.2; x <= 1.2; x += 0.05)
		  {
		   if (draw(x, y))
		   {
		    boolean left = draw(x - 0.05, y);
		    boolean right = draw(x + 0.05, y);
		    boolean up = draw(x, y + 0.1);
		    boolean down = draw(x, y - 0.1);
		    if (left && right && up && down)
		     System.out.print(" ");
		    else
		    	 System.out.print("*");
		   }
		   else
			   System.out.print(" ");
		  }
		  System.out.print("\n");
		 }
	}
	static boolean draw(double d, double e)
	{
	 double a = d * d + e * e - 1.0;
	 double b = d * d * e * e * e;
	 return a * a * a - b <= 0;
	}
}

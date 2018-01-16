/**
 * 
 */
package com.test;

import java.util.Arrays;

/**
 * @Project:myfirst  
 * @Class:IntFunction 
 * @author 高希阳
 * @date 2017-6-13 下午4:23:38   
 * @version 1.0.0 
 */

public class IntFunction {

	/**http://time.qq.com/?pgv_ref=aiotime
	 * binarySearch 二分查找
	 * @author GXY
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {9,1, 6,3, 4, 8};
		Arrays.sort(a);//对一个数组的所有元素进行排序，并且是按从小到大的顺序。
		int x1 = Arrays.binarySearch(a, 5);
		int x2 = Arrays.binarySearch(a, 4);
		int x3 = Arrays.binarySearch(a, 0);
		int x4 = Arrays.binarySearch(a, 10);
		System.out.println("x1:" + x1 + ", x2:" + x2);
		System.out.println("x3:" + x3 + ", x4:" + x4);
		System.out.println("=============================================");
		
		int b[] = new int[] {1, 3, 4, 6, 8, 9};  
		int x5 = Arrays.binarySearch(b, 1, 4, 5);  
        int x6 = Arrays.binarySearch(b, 1, 3, 4);  
        int x7 = Arrays.binarySearch(b, 1, 4, 2);  
        int x8 = Arrays.binarySearch(b, 1, 4, 10);  
        System.out.println("x5:" + x5 + ", x6:" + x6);  
        System.out.println("x7:" + x7 + ", x8:" + x8);  
        System.out.println("==============================================");
        System.out.println(12+11<<1);
        System.out.println(12+(11>>1));
        System.out.println((12+11)>>1);
        System.out.println(23>>1);
	}

}

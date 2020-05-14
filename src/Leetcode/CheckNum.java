package Leetcode;

import java.util.Arrays;
import java.util.Scanner;


public class CheckNum {
	public static void main(String []args) {
		int[] a = {2,7,11,15};
			int b=	9;
			try {
				int[] findIndexs = findIndexs(a,b);
				System.out.println(Arrays.toString(findIndexs));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static int[] findIndexs(int[] a,int b) throws Exception  {
		int[] c = new int[2];
		for (int i=0;i<a.length-1;i++) {
			int j=i+1;
			for (;j<a.length;j++) {
				int sum = a[i]+a[j];
				if(sum == b) {
					c[0] = i;
					c[1] = j;
					return c;
				}
			}
		}
		throw new Exception("没有符合要求的内容"); 
	}
}

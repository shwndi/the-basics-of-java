package Leetcode;

/**
 * 倒序排列
 * @author czy
 * @date 20200409
 */
public class Solution {
	public static void main (String [] args) {
		int a = 1534236460;
		//int b = reverse(a);
		int c = abc2cba(a);
	//	System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
    public static int reverse(int x) {
    	if(x == 0 || (x < 0 && -x < 0))
            return 0;
    	Boolean flag = false;
    	if (x<0) {
    		x=x*(-1);
    		flag= true;
    	}
    	String str = String.valueOf(x);
    	String result = new StringBuffer(str).reverse().toString();
    	double valueOf = Double.valueOf(result);
    	if(flag) {
    		valueOf=valueOf*(-1);
    	}
    	if(valueOf>Integer.MAX_VALUE||valueOf<Integer.MIN_VALUE) {
    		valueOf=0;
    	}
    	return (int)valueOf;
    }
    public static int abc2cba(int x) {
    	long n = 0;
    	while(x!=0) {
    		System.out.printf("%-10d",x);
    		n=n*10+x%10;
    		System.out.printf("%-10d",n);
    		x=x/10;
    		System.out.printf("%-10d",x);
    		System.out.println();
    	}
    	return (int)n==n?(int)n:0; 
    }
	/*
	 * System.out.printf("%-10s","abc");           //���10�У������(-�ű�ʾ�����)
	 * System.out.printf("%8d",23);                   //���8�У� �Ҷ���
	 * public static int abc2cba(int x) { long n = 0; System.out.print(n+"   ");
	 * while(x != 0) { n = X"+x); x = x/10;Z
	 * System.out.println("   "+x); } return (int)n==n? (int)n:0; }
	 */
}
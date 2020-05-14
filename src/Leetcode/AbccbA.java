package Leetcode;

public class AbccbA {
	public static void main(String [] args) {
		int x = 122321;
//		System.out.println(isPalindrome(x));
		System.out.println(aba(x));
	}
//	  public static boolean isPalindrome(int x) {
//		  Boolean flag = true; 
//		  String str = String.valueOf(x);
//		  int leg = str.length();
//		  for(int i =0; i<leg/2;i++) {
//			  char a = str.charAt(i);
//			  char b = str.charAt(leg-i-1);			  
//			  if(a!=b) {
//				  flag = false;
//			  }
//		  }
//		  return flag;
//	    }
	  public static boolean aba(int x) {
		  if(x<0)
			  return false;
		  int before = 0;
		  int after  = x;
		  while(after!=0) {
			  before = before*10+ after%10;
			  after  = after/10;
		  }
		  return before==x;
	  }
}

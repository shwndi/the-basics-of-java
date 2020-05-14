package string;

import java.util.StringTokenizer;

public class ziFuFenGeStringTokenizer {
	public static void main(String[] args) {
		 String str = "This is String , split by StringTokenizer, created by runoob";
		 StringTokenizer st1 = new StringTokenizer(str);
		 while(st1.hasMoreElements()) {
			 System.out.println(st1.nextElement());
		 }
		 StringTokenizer st2 = new StringTokenizer(str,",");
		 while(st2.hasMoreElements()) {
			 System.out.println(st2.nextElement());
		 }
		 
	}
}

package string;

public class stringFanZhuan {
//	public static void main(String []args) {
//		String str = "asdjfa";
//		StringBuffer reverse = new StringBuffer(str).reverse();
//		str = reverse.toString();
//		Class<? extends StringBuffer> class1 = reverse.getClass();
//		Class<? extends String> class2 = str.getClass();
//		int hashCode1 = reverse.hashCode();
//		int hashCode2 = str.hashCode();
//		System.out.printf("%-10s",reverse);
//		System.out.printf("%-20s",class1);
////		System.out.println(hashCode1);
//		System.out.println();
//		System.out.println();
//		System.out.printf("%-10s",str);
//		System.out.printf("%-20s",class2);
////		System.out.println(hashCode2);
//	}

	public static void main(String[] args) {
	String a= "asdfasdf";
		String  b = new StringBuffer(a).reverse().toString();
		System.out.println(b);
	}
}

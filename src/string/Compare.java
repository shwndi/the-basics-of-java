package string;

public class Compare {
	public static void main(String [] args) {
		String str1 = "abc";
		String str2 = "abcdef";
		Object obStr= str1;
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(obStr.toString()));
		System.out.println(obStr);
		System.out.println(obStr.toString());
	}
}

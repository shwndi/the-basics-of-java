package string;

public class DeleteAChar {
	public static void main(String [] args) {
		String str = "delete a char !";
		System.out.println(removeCharAt(str,3));
	}
	public static String removeCharAt(String str ,Integer i) {
		return str.substring(0,i)+str.substring(i+1,str.length());
	}

}

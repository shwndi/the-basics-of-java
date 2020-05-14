package string;

public class stringQuYuXiangDeng {

	public static void main(String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with microsoft";
		boolean bol1 = first_str.regionMatches(11,second_str, 12, 9);
		boolean bol2 = first_str.regionMatches(true,11,second_str,12, 9);
		System.out.println(bol1);
		System.out.println(bol2);
	}
}

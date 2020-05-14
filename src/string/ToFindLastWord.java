package string;

public class ToFindLastWord {
	public static void main(String [] args) {
		String str = "hello world , Hello WorlD";
		int lastIndexOf = str.lastIndexOf("WorlD");
		int lastIndexOf1 = str.lastIndexOf("W");
		int lastIndexOf2 = str.lastIndexOf("D");
		if(lastIndexOf == -1) {
			System.out.println("未找到"+str);
		}else {
			System.out.println(str+""+lastIndexOf);
			System.out.println("WorlD"+lastIndexOf);
			System.out.println("W撒地方卡"+lastIndexOf1);
			System.out.println("D蓝山咖啡"+lastIndexOf2);
		}
		
	}
}

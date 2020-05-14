package array;

public class makArray {
	public static void main(String []args) {
		//first:元素ֵ创建
		int[] a = {1,2,3,4,5,6,7};
		System.out.println("a:"+a.toString());
		//second:创建空间，填写元素�ֵ
		int [] b;
		b =  new int[] {1,2,3,4,5,6,7};
		System.out.println("b:"+b.toString());
		//third:确定数组长度�ֵ
		int[] c = new int [3];
		c[0]=0;
		c[1]=1;
		c[2]=2;
		System.out.println("c:"+c.toString());
	}
}

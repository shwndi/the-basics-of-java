package array;

public class LengthOfArray {
    public static void main(String []args){
        String[][] data = new String[2][5];
        System.out.println("一维数组长度:"+data.length);
        System.out.println("二维数组长度:"+data[0].length);

        Object[][] object = new Object[3][];
        String[] a = {"1","2","3","4","5","6","7"};
        String[]  b = {"aed","uhi","hkh"};
        String[] c ={"91","92","93","94","95","96","97"};
        object[0]=a;
        object[1]=b;
        object[2]=c;
        System.out.println("a："+object[0].length+"  add"+object[0]);
        System.out.println("a："+object[1].length+"  add"+object[1]);
        System.out.println("a："+object[2].length+"  add"+object[2]);
        System.out.println(object);
    }

}

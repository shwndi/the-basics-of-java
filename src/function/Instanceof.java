package function;

/**
 *测试左边的对象是否是它右边的类的实例
 *
 * @author czy
 * @date 2020/05/09
 */
public class Instanceof {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        Object o = new Object();
        o=1;
        boolean a = integer instanceof Integer ;
        boolean b = o instanceof Integer;
        System.out.println(a);
        System.out.println(b);
    }
}

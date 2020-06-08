package dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 旋转向量
 */
public class SwapTest {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector();
        vector.add(new Double(5.141592653));
        vector.add(new Double(4.13159));
        vector.add(new Double(3.187498));
        vector.add(new Double(2.26655));
        vector.add(new Double(1.1556));
        vector.add(new Double(0.215));
        vector.add(new Double(-1.226));
        System.out.println(vector);
        Double max = Collections.max(vector);
        Double min = Collections.min(vector);
        System.out.println("vector的最大值="+max);
        System.out.println("vector的最小值="+min);
        //交换位置
        Collections.swap(vector, 0, 3);
        System.out.println("swap()变换之后的值为："+vector);
    }
}

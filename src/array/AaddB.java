package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *  数组并集
 * @author czy
 *
 */
public class AaddB {
    public static void main(String[] args) {
        String[] arr1 = { "1", "2", "3" };
        String[] arr2 = { "4", "5", "6" };
        String[] union = getUnion(arr1, arr2);
        System.out.println("结果如下：");
        for (String s : union) {
            System.out.println(s);
        }
    }

    public static String[] getUnion(String[] arr1, String[] arr2) {
        Set set = new HashSet<>();
        for (String s : arr1) {
            set.add(s);
        }
        for (String s : arr2) {
            set.add(s);
        }
        String[] result={};
        return (String[]) set.toArray(result);
    }

}

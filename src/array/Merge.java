package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.add(Arrays.asList(b));
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        //数组相关的操作一般用Arrays打头阵
    }
}

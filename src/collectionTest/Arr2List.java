package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 * asList不能进行新增删除
 *
 */
public class Arr2List {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        List<Integer> list = Arrays.asList(arr);
        /**
         * Exception in thread "main" java.lang.UnsupportedOperationException
         */
        //list.add(4);
        System.out.println(list);
        //如果要进行新增和删除操作，用下面方法
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        ints.add(4);
        System.out.println(ints);
    }
}

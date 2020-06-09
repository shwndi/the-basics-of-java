package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1、数组集合转换
 * 2、元素循环移动
 * 3、最值获取
 * 4、寻找匹配数据
 *
 * @author czy
 * @date 2020/04/28
 */
public class ListAndArrays {
    public static void main(String[] args) {
        System.out.println("====================集合数组转换======================");
        String[] A = {"afdqa","afdas","asdfas"};
        List<String> strings = Arrays.asList(A);
        ArrayList arrayList = new ArrayList(strings);
        System.out.println(strings);
        System.out.println(arrayList);
        System.out.println(args);
        String[] array = strings.toArray(new String[2]);
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("====================循环移位======================");
        List<String> list = Arrays.asList("a b c d e f".split(" "));
        System.out.println(list);
        Collections.rotate(list, 2);
        System.out.println(list);
        System.out.println("====================最值获取=======================");
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println("max of list is :"+max);
        System.out.println("min of list is :"+min);
        System.out.println("====================元素替换=======================");
        Collections.replaceAll(list, "a", "adsfhja");
        System.out.println(list);
        //还原
        Collections.replaceAll(list, "adsfhja", "a");
        Collections.rotate(list, 4);
        ArrayList<String> listNew = new ArrayList<>();
        listNew.add("c");
        listNew.add("d");
        int index = Collections.indexOfSubList(list, listNew);
        System.out.println(index);
        int index1 = Collections.lastIndexOfSubList(list, listNew);
        System.out.println(index1);

    }
}

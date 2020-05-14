package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换
 * @author czy
 * @date 2020/04/28
 */
public class ListAndArrays {
    public static void main(String[] args) {
        String[] A = {"afdqa","afdas","asdfas"};
        List<String> strings = Arrays.asList(A);
        ArrayList arrayList = new ArrayList(strings);
        System.out.println(strings);
        System.out.println(arrayList);
        System.out.println(args);
    }
}

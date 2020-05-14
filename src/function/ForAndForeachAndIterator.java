package function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 循环
 *
 * @author czy
 * @date 2020/05/12
 */
public class ForAndForeachAndIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("123");
        list.add("234");
        list.add("345");

        System.out.println("----------方式1：普通for循环-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /**
         * 迭代器自加
         */
        System.out.println("----------方式2：使用迭代器-----------");
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

        System.out.println("----------方式3：For-Each 循环-----------");
        for (String str : list) {
            System.out.println(str);
        }
    }

}

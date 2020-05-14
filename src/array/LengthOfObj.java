package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfObj {
    public static void main(String[] args) {
        /**
         * 求对象的长度总结
         */
        //list集合用size（）
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sizeOfList = list.size();
        System.out.println(sizeOfList);

        //map集合用size（）
        Map map = new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        int sizeOfMap = map.size();
        System.out.println(sizeOfMap);

        //String用length()
        String str ="shwndi";
        int lengthOfStr = str.length();
        System.out.println(lengthOfStr);

        //数组使用length
        int[] arr ={1,2,3,4,5};
        int lengthOfArr = arr.length;
        System.out.println(lengthOfArr);

        ArrayAdd arrayAdd = new ArrayAdd();


    }
}

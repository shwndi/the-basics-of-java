package array;

import java.util.ArrayList;

public class AinB {
    public static void main(String[] args) {
        /**
         * 包含关系
         * contains必须是元素进行比较
         * A.contains(String)
         */
        ArrayList objArray = new ArrayList<>();
        ArrayList objArray2 = new ArrayList<>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        System.out.println("objArray 是否包含字符串common2? ： "+
                objArray.contains("common2"));
        System.out.println("objArray2是否包含objArray？："+
                objArray2.contains(objArray));
    }
}

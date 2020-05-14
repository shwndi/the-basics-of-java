package array;

import java.util.Arrays;

public class AisB {
    public static void main(String[] args) {
        /**
         * 判断数组是否相等
         */
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        int[] arr3 = {1,2,3,4,5,6};
        System.out.println("数组 ary 是否与数组 ary1相等? ："
                + Arrays.equals(ary,ary1));
    }
}

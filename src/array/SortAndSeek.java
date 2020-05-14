package array;

import java.util.Arrays;

public class SortAndSeek {
    public static void main(String[] args) {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 ,2};
        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组结果",array);
        //找第二个元素所在位置（从1开始）
        int a =Arrays.binarySearch(array,2);
        int b =Arrays.binarySearch(array,2);
        System.out.println(a);
        System.out.println(b);
    }
    public static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}

package array;

import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Arrays.fill(arr,100);
        System.out.println(arr.toString());
        for (int i=0, n=arr.length; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

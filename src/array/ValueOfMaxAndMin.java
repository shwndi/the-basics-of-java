package array;

import java.util.Arrays;
import java.util.Collections;

public class ValueOfMaxAndMin {
    public static void main(String[] args) {
        Integer[] arr = {2,4,5,2,5,1,6,8};
        int min= Collections.min(Arrays.asList(arr));
        int max= Collections.max(Arrays.asList(arr));
        System.out.println(min);
        System.out.println(max);
    }
}

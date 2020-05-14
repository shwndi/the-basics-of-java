package array;


import java.util.Arrays;

/**
 * 数组扩展
 */
public class Extend {
    public static void main(String[] args) {
        String[] strings =new String[]{"hfash","aksfj","shwndi"};
        String[] extend = new String[5];
        extend[3]="fa";
        extend[4]="sf";
        System.arraycopy(strings,0,extend,0,strings.length);
        System.out.println(Arrays.asList(extend));


    }
}

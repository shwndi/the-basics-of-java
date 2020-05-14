package function;

import java.util.HashMap;
import java.util.Map;

/**
 * varags
 *
 * @author czy
 */
public class VariableNumberOfarguements {
    static int variableNumberOfArguements(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    static boolean variableNumberOfArguements(boolean...a){
        boolean flag = true;
        for (boolean b : a) {
            flag =flag&&b;
        }
        return flag;
    }
    static Map<String,Integer> variableNumberOfArguements(String s,int...a){
        Map map = new HashMap();
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        map.put(s,sum);
        return map;
    }

    static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        int i = variableNumberOfArguements(1, 2, 3);
        boolean b = variableNumberOfArguements(true, false, true);
        Map<String, Integer> map = variableNumberOfArguements("asfda", 1, 2, 3);
        System.out.println(sum);
        System.out.println(i);
        System.out.println(b);
        System.out.println(map.toString());
    }
}

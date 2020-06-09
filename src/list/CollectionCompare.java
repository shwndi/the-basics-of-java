package list;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 集合比较：（字符串比较）
 * collection.min()使用了String的比较大小方法
 * StringB.compareTo（StringA）;
 * 1、A和B从首位开始逐级比较，返回B-A的编码差值；
 * 2、如果前面相同，返回B-A的长度差
 */
public class CollectionCompare {
    public static void main(String[] args) {
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set = new TreeSet<String>();
        for (int i = 0; i < coins.length; i++) {
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        //忽略大小写String.CASE_INSENSITIVE_ORDER
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}

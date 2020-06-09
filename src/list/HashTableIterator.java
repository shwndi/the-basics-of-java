package list;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 遍历 HashTable 的键值
 */
public class HashTableIterator {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "111");
        hashtable.put(2, "222");
        hashtable.put(3, "333");
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }
    }
}

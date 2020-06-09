package list;

import java.util.*;

/**
 * 1、遍历HashMap
 * 2、遍历HashSet
 * 3、数据添加区别put 、add
 * 4、计算长度
 */
class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");
        System.out.println("===================迭代遍历HashMap=====================");
        Iterator<String> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===================增强for循环遍历HashMap=====================");
        System.out.println("HashMap只能使用迭代器循环遍历，没有其他方法直接遍历");
        System.out.println("===================keySet()获取HashMap值的集合、entrySet()获取键值对集合=====================");
        /**
         * set有for循环和迭代器可以使值循环遍历
         */
        Set<String> strings = hashMap.keySet();
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println("========================================");
        HashSet hashSet = new HashSet<>();
        String str1 = "1111";
        String str2 = "2222";
        String str3 = "3333";
        String str4 = "4444";
        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
        Iterator<String> iterator1 = hashSet.iterator();
        System.out.println("===================迭代遍历HashSet=====================");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("===================增强for循环遍历HashSet=====================");
        for (Object str : hashSet) {
            System.out.println(str);
        }
        System.out.println("========================================");
        System.out.println("hashMap 的长度"+hashMap.size());
        System.out.println("hashSet 的长度"+hashSet.size());
    }
}

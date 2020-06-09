package list;

import java.util.*;

/**
 * 集合反转
 * 元素删除
 */
public class CollectionsRevers {
    public static void main(String[] args) {

        String[] arr = {"12", "23", "34", "45", "56"};
        List<String> list = Arrays.asList(arr);
        List arrayList = new ArrayList(list);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println("===========================================");
        HashSet hashSet = new HashSet();
        HashMap<Object, Object> hashMap = new HashMap<>();
        String str1 = "111";
        String str2 = "222";
        String str3 = "333";
        String str4 = "444";
        String str5 = "555";
        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
        hashSet.add(str5);
        hashMap.put("str1", str1);
        hashMap.put("str2", str2);
        hashMap.put("str3", str3);
        hashMap.put("str4", str4);
        hashMap.put("str5", str5);
        System.out.println("hashMap="+hashMap);
        System.out.println("hashSet="+hashSet);
        System.out.println("===================移除元素=====================");
        hashMap.remove("str2");
        hashSet.remove(str2);
        System.out.println("移除元素后hashMap="+hashMap);
        System.out.println("移除元素后hashSet="+hashSet);
    }
}

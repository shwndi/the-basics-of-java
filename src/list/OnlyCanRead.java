package list;

import java.util.*;

/**
 * 1、设置只读集合
 * 2、集合输出
 * @author czy
 * @date 2020/06/09
 *
 *
 */
public class OnlyCanRead {
    public static void main(String[] args) {
        System.out.println("=====================设置只读=======================");
        List<String> strings = Arrays.asList(new String[]{"1", "2", "3"});
        List<String> list = new ArrayList<>(strings);
        List<String> stringList = Collections.unmodifiableList(list);
        try{
            stringList.set(0, "9");
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        HashMap<Object, Object> hashMap = new HashMap<>();
        HashSet<Object> hashSet = new HashSet<>();
        Map<Object, Object> map = Collections.unmodifiableMap(hashMap);
        Set<Object> set = Collections.unmodifiableSet(hashSet);
        System.out.println(stringList.toString()+map+set+"为只读");
        System.out.println("=====================集合输出=======================");
        System.out.println("=====================HashMap输出=======================");
        Map map1 = new HashMap<Integer,String>();
        map1.put(1, "111");
        map1.put(2, "222");
        map1.put(3, "333");
        map1.put(4, "444");
        System.out.println(map1);
        Set<Map.Entry<Integer,String>> entrySet = map1.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print("< key="+key+",value="+value+">\t");
        }
        Set<Integer> keySet = map1.keySet();
        for (Integer s : keySet) {
            System.out.print(s+"\t");
        }
        Collection values = map1.values();
        System.out.println(values);
        System.out.println("=====================HashSet输出=======================");
        HashSet<Object> hashSet1 = new HashSet<>();
        hashSet1.add("111");
        hashSet1.add("222");
        hashSet1.add("333");
        hashSet1.add("444");
        System.out.println(hashSet1);
        System.out.println("=====================TreeMap输出=======================");
        TreeMap treeMap = new TreeMap<>();
        treeMap.put(1, "Sunday");
        treeMap.put(2, "Monday");
        treeMap.put(3, "Tuesday");
        treeMap.put(4, "Wednesday");
        treeMap.put(5, "Thursday");
        treeMap.put(6, "Friday");
        treeMap.put(7, "Saturday");
        System.out.println(treeMap);
        System.out.println("TreeMap 键："
                + treeMap.keySet());
        System.out.println("TreeMap 值："
                + treeMap.values());
        System.out.println("键为 5 的值为: " + treeMap.get(5)+ "\n");
        System.out.println("第一个键: " + treeMap.firstKey()
                + " Value: "
                + treeMap.get(treeMap.firstKey()) + "\n");
        System.out.println("最后一个键: " + treeMap.lastKey()
                + " Value: "+ treeMap.get(treeMap.lastKey()) + "\n");
        System.out.println("移除第一个数据: "
                + treeMap.remove(treeMap.firstKey()));
        System.out.println("现在 TreeMap 键为: "
                + treeMap.keySet());
        System.out.println("现在 TreeMap 包含: "
                + treeMap.values() + "\n");
        System.out.println("移除最后一个数据: "
                + treeMap.remove(treeMap.lastKey()));
        System.out.println("现在 TreeMap 键为: "
                + treeMap.keySet());
        System.out.println("现在 TreeMap 包含: "
                + treeMap.values());
    }
}

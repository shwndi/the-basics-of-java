package dataStructure;

import java.util.LinkedList;

/**
 * Linkedlist操作
 * 1、新增
 * 2、删除
 * 3、修改
 * 4、查询（1：删除2：不删除）
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        System.out.println(linkedList);
        linkedList.addFirst("0");
        System.out.println(linkedList);
        linkedList.addLast("6");
        System.out.println(linkedList);
        System.out.println("链表的第一个元素是：" + linkedList.getFirst());
        System.out.println("链表的最后一个元素是：" + linkedList.getLast());
        System.out.println("元素 2 第一次出现的位置：" + linkedList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置："+ linkedList.lastIndexOf("2"));
        linkedList.subList(1, 3).clear();
        System.out.println(linkedList);
        //获取元素不删除
        String s = linkedList.get(2);
        System.out.println(s+"\t"+linkedList);
        //设置链表数据
        String set = linkedList.set(2, "设置操作");
        System.out.println("修改位置原数据:"+set);
        System.out.println(linkedList);
        //获取第一个元素并删除
        String x = linkedList.removeFirst();
        System.out.println(x+"\t"+linkedList);
    }
}

package dataStructure;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 队列用法
 * @author czy
 * @date 2020/06/08
 */
public class QuereTest {
    public static void main(String[] args) {
        //当调用add()和remove()方法失败时，会抛异常
        LinkedList<String> queue = new LinkedList<>();
        //因此使用offer（）
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println("====================================");
        printQuere(queue);
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        System.out.println("====================================");
        printQuere(queue);
        System.out.println("element="+queue.element()); //返回第一个元素
        System.out.println("====================================");
        printQuere(queue);
        System.out.println("peek="+queue.peek()); //返回第一个元素
        System.out.println("====================================");
        String max = Collections.max(queue);
        System.out.println("max="+max);
    }

    public static void printQuere(LinkedList<String> queue) {
        for (String q : queue) {
            System.out.print(q);
        }
        System.out.println();
    }
}

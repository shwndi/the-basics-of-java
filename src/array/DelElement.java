package array;

import java.util.ArrayList;

/**
 * 删除数组元素
 */
public class DelElement {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);
        objArray.remove("第 0 个元素");
        System.out.println("数组删除元素后："+objArray);
    }
}

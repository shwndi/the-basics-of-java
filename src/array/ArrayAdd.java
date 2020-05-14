package array;

import java.util.Arrays;

import static array.SortAndSeek.printArray;

public class ArrayAdd {
    /**
     * 数组添加元素的思路
     * 1、新建数组长度加一
     * 2、把原数组的数据和新的元素放在指定位置
     * 使用System.arraycopy()来操作
     * @param args
     */
    public static void main(String[] args) {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        //数组排序
        Arrays.sort(array);
        printArray("数组信息",array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素 1 所在位置（负数为不存在）："
                + index);
        int indexNew = -index -1;
        array= insertElement(array,1, indexNew);
        printArray("新数组信息",array);
    }

    /**
     * 增加数组长度
     * @param array
     * @param a
     * @param indexNew
     * @return
     */
    public static int[] insertElement(int[] array, int a, int indexNew) {
        int length = array.length;
        int[] newArr = new int[length + 1];
        System.arraycopy(array,0,newArr,0,indexNew);
        newArr[indexNew]=a;
        System.arraycopy(array,indexNew,newArr,indexNew+1,length-indexNew);
        return newArr;
    }
}

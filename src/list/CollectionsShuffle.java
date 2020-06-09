package list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 集合乱序设置
 */
public class CollectionsShuffle {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("1231");
        arrayList.add(1223);
        arrayList.add(0.24);
        arrayList.add("afasfda");
        arrayList.add(12312L);
        System.out.println(arrayList);
        for (int i = 0; i < 5; i++) {
            //打乱顺序
            Collections.shuffle(arrayList);
            System.out.println(arrayList);
        }
    }
}

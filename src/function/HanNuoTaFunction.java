package function;

import java.io.IOException;
import java.util.Scanner;

/**
 * 汉诺塔算法
 *(迭代)
 * @author czy
 * @date 2020/05/07
 */
public class HanNuoTaFunction {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int topN = scanner.nextInt();
        doTower(topN,'A','B','C');
    }

    /**
     * 整体部分法：
     * 首先把n， n-1->1分别看作一个整体
     * 1：把n-1从A借助C移动到B
     * 2：把n从A借助B移动到C
     * 3：把n-1从B借助A移动到C
     *
     * @param topN
     * @param from
     * @param middle
     * @param to
     */
    public static void doTower(int topN,char from ,char middle,char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from "
                    + from + " to " + to);
        } else {
            doTower(topN - 1, from, to, middle);
            System.out.println("Disk "
                    + topN + " from " + from + " to " + to);
            doTower(topN - 1, middle, from, to);
        }
    }
}

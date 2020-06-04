package dataStructure;

/**
 * 加
 * 使用do...while结构求0~100的整数数字之和：
 */
public class Add {
    public static void main(String[] args) {
        int limit = 1000;
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while(i<=limit);
        System.out.println(sum);
    }
}

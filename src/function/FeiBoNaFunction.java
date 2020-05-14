package function;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 斐波那契数
 */
public class FeiBoNaFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long a = F(num);
        System.out.println(a);
    }

    static long F(int n)
    {
        if(n==1||n==2) {return 1;}
        else {
            return F(n-1)+F(n-2);
        }
    }
}

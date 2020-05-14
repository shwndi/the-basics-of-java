package function;

import java.math.BigInteger;
import java.security.InvalidParameterException;

/**
 * 阶乘(递归)
 *
 * @author czy
 * @date 2020/05/07
 */
public class Factorial {
    public static void main(String[] args) {
//        BigInteger a = BigInteger.valueOf(9);
//        BigInteger f = getFactorial(a);
        long b = 9;
        long f= factorial(b);
        System.out.println(f);
    }

    private static long factorial(long b) {
        if (b==0){
            throw  new InvalidParameterException();
        }
        if (b==1){
            return b;
        }
        b*=factorial(b-1);
        return b;
    }

    public static BigInteger getFactorial(BigInteger a) {
        if (a.compareTo(BigInteger.valueOf(1))==0) {
            a=a;
        }
        a=a.multiply(getFactorial(a.subtract(BigInteger.valueOf(1))));
        return  a;
    }
}

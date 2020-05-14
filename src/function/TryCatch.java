package function;

/**
 * try-catch执行顺序
 *
 * @author czy
 * @date 2020/05/07
 */
public class TryCatch {
    public static void main(String[] args) {
        /**
         * 只要有异常，立马捕捉，不执行之后的语句
         * 类似return
         */
        try {
            System.out.println("233");
            int[] a = new int[1];
            a[2] = 5;
            System.out.println("adaf");
        } catch (Exception e) {
            System.out.println("eeeee");
        }
    }
}

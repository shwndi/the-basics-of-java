package Time;

/**
 * 时间等待
 *
 * @author czy
 * @date 2020/05/07
 */
public class WateAMoment {
    public static void main(String[] args) throws InterruptedException {
        int a=1;
        long before = System.currentTimeMillis();
        Thread.sleep(1000);
        long after = System.currentTimeMillis();
        System.out.println("before:"+before+"/n"+"after:"+after);
        System.out.println(after-before);
        Thread.currentThread().sleep(1000);
    }
}

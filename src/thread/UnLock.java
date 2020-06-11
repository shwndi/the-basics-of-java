package thread;

import java.util.concurrent.Semaphore;

public class UnLock{
    public static String srt1 = "str1";
    public static final Semaphore s1=new Semaphore(1);
    public static String srt2 = "str2";
    public static final Semaphore s2=new Semaphore(1);

    public static void main(String[] args) {
        UnlockA unlockA = new UnlockA();
        new Thread(unlockA).start();
        UnlockB unlockB = new UnlockB();
        new Thread(unlockB).start();
    }
}

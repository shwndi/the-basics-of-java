package thread;

import java.util.Date;

public class DeadLockA implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                synchronized (DeadLock.str1) {
                    System.out.println(new Date().toString() + " LockA 锁住 str1");
                    Thread.sleep(3000); // 此处等待是给B能锁住机会
                    synchronized (DeadLock.str2) {
                        System.out.println(new Date().toString() + " LockA 锁住 str2");
                        Thread.sleep(60 * 1000); // 为测试，占用了就不放
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

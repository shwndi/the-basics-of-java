package thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnlockB  extends Thread{
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                if (UnLock.s2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockB 锁住 s2");
                    if (UnLock.s1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockB 锁住 s1");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + " LockB 锁 s1 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockB 锁 s2 失败");
                }
                UnLock.s1.release(); // 释放
                UnLock.s2.release();
                Thread.sleep(10 * 1000); // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

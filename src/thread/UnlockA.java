package thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnlockA  extends Thread{
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                if (UnLock.s1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 s1");
                    if (UnLock.s2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 s2");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + " LockA 锁 s2 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockA 锁 s1 失败");
                }
                UnLock.s1.release(); // 释放
                UnLock.s2.release();
                Thread.sleep(1000); // 马上进行尝试，现实情况下do something是不确定的
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

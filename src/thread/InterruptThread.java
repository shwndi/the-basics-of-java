package thread;

/**
 * 1、打断线程
 * 2、获取所有线程
 */
public class InterruptThread extends Thread{
    @Override
    public void run(){
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)throws Exception {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();
        interruptThread.interrupt();
        interruptThread.join();
        System.out.println("线程已经退出!");
        System.out.println("================获取所有线程=======================");
        /*InterruptThread thread = new InterruptThread();
        thread.setName("皮卡丘");
        thread.start();*/
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        int count = group.activeCount();
        Thread[] threads = new Thread[count];
        group.enumerate(threads);
        for (int i = 0; i < count; i++) {
            System.out.println("线程号：" + i + " = " + threads[i].getName());
        }
    }
}

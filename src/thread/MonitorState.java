package thread;

/**
 * 监控状态
 */
public class MonitorState {
    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            System.out.println("===================添加名称===================");
            thread.setName("皮卡丘");
            showThreadStatus(thread);
            System.out.println("===================线程开启===================");
            thread.start();
            showThreadStatus(thread);
            System.out.println("===================线程休眠===================");
            thread.sleep(50);
            showThreadStatus(thread);
            System.out.println("===================设定等待时间===================");
            thread.waiting = false;
            showThreadStatus(thread);
            System.out.println("===================线程休眠===================");
            thread.sleep(50);
            showThreadStatus(thread);
            System.out.println("===================notice===================");
            thread.notice();
            showThreadStatus(thread);
            System.out.println("===================线程休眠===================");
            thread.sleep(50);
            showThreadStatus(thread);
            while (thread.isAlive()){
                System.out.println("alive");
                showThreadStatus(thread);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static void showThreadStatus(Thread thread) {
        System.out.println("threadName:" + thread.getName() + "Alive:" + thread.isAlive() + " State:" + thread.getState());
    }
}

package thread;

/**
 * 获取优先级
 */
public class GetPriority {
    private static Runnable makeRunnable() {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Thread t = Thread.currentThread();
                    System.out.println("in run() - priority="
                            + t.getPriority()+ ", name=" + t.getName());
                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException x) {
                    }
                }
            }
        };
        return r;
    }
    public static void main(String[] args) {
        System.out.println("in main() - Thread.currentThread().getPriority()=" + Thread.currentThread().getPriority());
        System.out.println("in main() - Thread.currentThread().getName()="+ Thread.currentThread().getName());
        Thread threadA = new Thread(makeRunnable(), "threadA");
        threadA.start();
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException x) {
        }
        System.out.println("in main() - threadA.getPriority()="+ threadA.getPriority());
    }
}

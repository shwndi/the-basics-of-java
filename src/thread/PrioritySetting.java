package thread;

/**
 * 线程优先级设置
 */
public class PrioritySetting extends Thread {
    private int countDown = 5;
    private volatile double d = 0;

    public PrioritySetting(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ":" + countDown;
    }

    public void run() {
        while (true) {
            for (int i = 0; i < 10000; i++) {
                d = d + (Math.PI + Math.E) / (double) i;
                System.out.println(this);
                if (--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        new PrioritySetting(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++)
            new PrioritySetting(Thread.MIN_PRIORITY);
    }
}

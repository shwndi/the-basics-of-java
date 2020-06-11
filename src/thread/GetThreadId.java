package thread;

/**
 * 获取线程ID
 * ？30从哪的到的
 */
public class GetThreadId implements Runnable {
    private ThreadID id;
    public GetThreadId(ThreadID id){
        this.id=id;
    }

    @Override
    public void run() {
        try {
            print("var getThreadID =" + id.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID =" + id.getThreadID());
        } catch (InterruptedException x) {
        }
    }
    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
    public static void main(String[] args) {
        ThreadID tid = new ThreadID();
        GetThreadId shared = new GetThreadId(tid);

        try {
            Thread threadA = new Thread(shared, "threadA");
            threadA.start();

            Thread.sleep(500);

            Thread threadB = new Thread(shared, "threadB");
            threadB.start();

            Thread.sleep(500);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();
        } catch (InterruptedException x) {
        }
    }
}

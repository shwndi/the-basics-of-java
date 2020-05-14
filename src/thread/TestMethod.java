package thread;

import java.util.concurrent.*;

/**
 * 线程开启的三种方式
 *
 * @author czy
 */
public class TestMethod{
    public static void main(String []args){
        /***************************************************/
        MethodOfThread thread = new MethodOfThread();
        thread.start();
        /***************************************************/
        MethodOfRunnable runnable = new MethodOfRunnable();
        Thread runable = new Thread(runnable);
        runable.start();
        /***************************************************/
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future submit = executorService.submit(new MethodOfCallable());
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


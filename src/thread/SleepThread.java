package thread;

/**
 * 线程挂起
 */
public class SleepThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;
    public SleepThread(){
        super(""+ ++threadCount);
        start();
    }
    @Override
    public String toString(){
        return "#" +getName()+"："+countDown;
    }
    @Override
    public void run(){
        while(true){
            System.out.println(this);
            if (--countDown==0)
                return;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args)
        throws InterruptedException{
        for (int i=0;i<5;i++){
            new SleepThread().join();
            System.out.println("线程已被挂起");
        }
    }
}

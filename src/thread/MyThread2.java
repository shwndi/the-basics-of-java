package thread;

public class MyThread2 extends Thread {
    boolean waiting = true;
    boolean ready = false;
    MyThread2(){}
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("ThreadName="+name);
        while (waiting){
            System.out.println("waiting="+waiting);
            System.out.println("waiting...");
            startWait();
            try {
                Thread.sleep(1000);
            }
            catch(Exception exc) {
                System.out.println(name + " interrupted.");
            }
            System.out.println(name + " terminating.");
        }
    }

    synchronized void startWait() {
        while(!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("wait() interrupted");
            }
        }
    }

    synchronized void notice(){
        ready = true;
        notify();
    }
}

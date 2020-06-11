package thread;

/**
 * 查看线程存存活
 */
public class CheckAliveAboutThread extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            printMsg(i);
        }
    }

    private void printMsg(Integer i) {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        if (i!=null){
            name = name+" "+i;
        }
        System.out.println("the name of Thread is "+name);
    }

    public static void main(String[] args) {
        CheckAliveAboutThread thread = new CheckAliveAboutThread();
        System.out.println("===============-==获取存活状态isAlive=================");
        thread.setName("Thread");
        System.out.println("before start(), thread.isAlive()=" + thread.isAlive());
        thread.start();
        System.out.println("just after start(), thread.isAlive()=" + thread.isAlive());
        System.out.println("===============-==获取线程名称getName=================");
        for (int i = 0; i < 10; i++) {
            thread.printMsg(null);
            System.out.println("in for(), thread.isAlive()=" + thread.isAlive());
        }
        System.out.println("The end of main(), , thread.isAlive()=" + thread.isAlive());

    }

}

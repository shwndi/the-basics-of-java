package thread;

/**
 * 继承Thread类，并重写其run()方法
 *
 * @author czy
 */
public class MethodOfThread extends Thread{
    @Override
    public void run(){
        System.out.println("继承Thread类，并重写其run()方法");
    }
}


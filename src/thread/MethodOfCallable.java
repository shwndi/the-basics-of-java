package thread;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口，并实现其call()方法
 *
 * @author czy
 */
public class MethodOfCallable implements Callable {
    @Override
    public String call(){
        System.out.println("实现Callable接口，并实现其call()方法");
        return null;
    }
}

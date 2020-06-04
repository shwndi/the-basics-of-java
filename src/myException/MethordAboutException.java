package myException;

import java.io.IOException;

/**
 * 异常处理方法
 * 1、throws出现在方法函数头；而throw出现在函数体。
 * 2、throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某种异常对象。
 * 3、两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。
 *
 * @author czy
 * @date 2020/06/02
 */
public class MethordAboutException {
    public static void main(String[] args) throws Exception {
        test();
    }

    /**
     * 测试方法
     *
     * @throws IOException
     */
    private static void test() throws IOException {
        try {
            throw new Exception("My Exception .");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
        throw new IOException("test");
    }
}

package myException;

import org.apache.commons.io.output.WriterOutputStream;

import java.io.*;

/**
 * 捕获异常顺序（先子类后父类）
 * 反过来就会报错
 * printStackTrace()：打印堆栈信息
 */
public class CatchException {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("123213.txt"));
            String  str = null;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println("first:"+e);
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("first:"+e);
            e.printStackTrace();
        }

    }
}

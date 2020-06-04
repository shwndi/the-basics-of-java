package myException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 1、关于return的书写方式
 * 2、finally必执行，或覆盖前面的return值
 * 3、try和catch选择执行
 * 4、不想覆盖可以把return放在结构之外
 */
public class ReturnOfException {
    public static void main(String[] args) {
        String result = test();
        System.out.println(result);
    }
        private static String test(){
            try {
                new BufferedReader(new FileReader("d:asdaf.sql"));
                return "try";
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "catch";
            } finally {
                return "finally";
            }
        }
}

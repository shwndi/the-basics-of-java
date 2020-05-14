package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件
 *
 * @author czy
 */
public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("23.txt"));
            String  str = null;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

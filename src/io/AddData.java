package io;

import java.io.*;

/**
 * 向文件中追加数据
 * @author czy
 * @date 2020/05/14
 */
public class AddData {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("123"));
            out.write("askdjfh\n");
            out.close();
            out = new BufferedWriter(new FileWriter("123", true));
            out.write("jjpppu");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("123"));
            String str;
            while ((str=in.readLine())!=null){
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *写文件
 */
public class Write {
    public static void main(String[] args) throws IOException {
        //不规定路径时，创建在项目目录之下
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("23.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("23.txt",true));
        bufferedWriter.write("\r\n11werqwerqqr\r\n");
        bufferedWriter.write("22werqwerqqr");
        bufferedWriter.close();
        System.out.println("创建成功！");
    }

}

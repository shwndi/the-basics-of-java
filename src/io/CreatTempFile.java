package io;

import java.io.File;
import java.io.IOException;

/**
 * 创建临时文件
 * @author czy
 * @date 2020/05/14
 */
public class CreatTempFile {
    public static void main(String[] args) {
        File f =null;
        //创建临时文件
        try {
            f = File.createTempFile("tem",".txt",new File("d:/"));
            //输出绝对路径
            System.out.println("File path" + f.getAbsolutePath());
            //终止后删除临时文件
            f.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

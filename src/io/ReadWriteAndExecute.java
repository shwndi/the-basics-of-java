package io;

import java.io.File;
import java.io.IOException;

/**
 * 文件权限设置
 *
 * @author czy
 * @date 2020/05/19
 */
public class ReadWriteAndExecute {
    public static void main(String[] args) throws IOException {
        //d
        File file = new File("d:/cc.txt");
        System.out.println(file.exists());
        //创建
        file.createNewFile();
        //无效操作：Runtime.getRuntime().exec("chmod 000 d:/cc.txt");
        //检测文件是否存在
        System.out.println(file.exists());
        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(true);
        System.out.println("is execute allow : " + file.canExecute());
        System.out.println("is read allow : " + file.canRead());
        System.out.println("is write allow : " + file.canWrite());
    }
}

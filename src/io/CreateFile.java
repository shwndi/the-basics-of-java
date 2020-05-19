package io;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件
 *
 * @author czy
 * @date 2020/05/19
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = null;
        File dir = new File("D:/dd/");
        /**
         * 路径文件不存在时要添加创建文件夹
         */
        dir.mkdirs();
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}

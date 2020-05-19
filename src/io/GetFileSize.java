package io;

import java.io.File;

/**
 * 获取文件大小
 *
 * @author czy
 * @date 2020/05/18
 */
public class GetFileSize {
    public static void main(String[] args) {
        File file = new File("d:/aa.sql");
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
        } else {
            long length = file.length();
            System.out.println(length);
        }
    }
}

package io;

import java.io.File;
import java.util.Date;

/**
 * 获取文件修改时间
 *
 * @author czy
 * @date 2020/05/19
 */
public class FileUpdateTime {
    public static void main(String[] args) {
        File file = new File("d:/dd/JavaTemp6939686952898951952.javatemp");
        long l = file.lastModified();
        Date date = new Date(l);
        System.out.println(date);
    }
}

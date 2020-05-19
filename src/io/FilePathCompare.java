package io;

import java.io.File;

/**
 * 文件路径比较
 *
 * @author czy
 * @date 2020/05/19
 */
public class FilePathCompare {
    public static void main(String[] args) {
        File file1 = new File("d:/aa.sql");
        File file2 = new File("d:/aa.txt");
        if(file1.compareTo(file2)==0){
            System.out.println("文件路径相同");
        }else {
            System.out.println("文件路径不相同");
        }
    }
}

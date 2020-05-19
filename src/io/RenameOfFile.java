package io;

import java.io.File;

/**
 * 文件重命名
 *
 * @author czy
 * @date 2020/05/18
 */
public class RenameOfFile {
    public static void main(String[] args) {
        File oldFile = new File("d:/aa.txt");
        File newFile = new File("d:/bb.txt");
        oldFile.renameTo(newFile);
    }
}

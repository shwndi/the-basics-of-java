package io;

import java.io.File;

/**
 * 删除文件
 * @author czy
 * @date 2020/05/14
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file1 = new File("d://aa.sql");
        //File file2 = new File("23.txt");
        if (file1.delete()){
            System.out.println("文件已删除！");
        }else{
            System.out.println("文件删除失败！");
        }

    }

}

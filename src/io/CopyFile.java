package io;

import java.io.*;

/**
 * 复制文件
 * @author czy
 * @date 2020/05/13
 */
public class CopyFile {
    public static void main(String[] args) {
        /*RandomAccessFile file;
        file.seek();
        file.write();*/
        try {
            InputStream in = new FileInputStream(new File("d:/aa.sql"));
            /**
             * 添加true的时候会追加数据
             * 不添加时清空保存
             */
            OutputStream out = new FileOutputStream("23.txt");
            out.write(13);
            int len;
            byte[] buf = new byte[1024];
            while((len = in.read(buf))>0){
                out.write(buf,0,len);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package io;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.Date;

/**
 * 修改文件最后的修改日期
 * @author czy
 * @date 2020/05/15
 */
public class UpdateDateOfFile {
    public static void main(String[] args) throws Exception{
        File file = new File("D:/aa.sql");
        file.createNewFile();
        Date filetime = new Date(file.lastModified());
        System.out.println(filetime.toString());
        System.out.println(file.setLastModified(System.currentTimeMillis()));
        filetime = new Date(file.lastModified());
        System.out.println(filetime.toString());

    }
}

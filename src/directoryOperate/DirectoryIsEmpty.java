package directoryOperate;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * 1、判断目录为空
 * 2、判断文件是否隐藏
 * 3、获取目录大小
 */
public class DirectoryIsEmpty {

    public static void main(String[] args) {
        File file = new File("/23.txt");
        String path = file.getAbsolutePath();
        System.out.println("path:"+path);
        if (file.isDirectory()){
            if (file.list().length>0) {
                System.out.println("it`s not null !");
            }else{
                System.out.println("it`s null !");
            }
        }else {
            System.out.println("it`s a file !");
            /**
             * 判断文件隐藏
             */
            System.out.println(file.isHidden());
        }
        /**
         * 获取目录大小
         * 添加依赖common-io.ja
         */
        long size = FileUtils.sizeOfDirectory(new File("C:/test"));
        System.out.println("Size: " + size + " bytes");
    }
}

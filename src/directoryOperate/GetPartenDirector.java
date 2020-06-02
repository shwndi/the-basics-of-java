package directoryOperate;

import javax.crypto.spec.PSource;
import java.io.File;
import java.util.Date;

/**
 * 1、获取上级目录（父目录名称）
 * 2、获取修改时间
 * 3、打印目录结构
 * 4、打印目录下文件
 *
 * @author czy
 * @date 2020/06/02
 */
public class GetPartenDirector {
    public static void main(String[] args){
        System.out.println("-------------------------------------------");
        System.out.println("                 父目录名称");
        System.out.println("-------------------------------------------");
        File file = new File("d:/aa.sql");
        String parentName = file.getParent();
        System.out.println(parentName);
        System.out.println("-------------------------------------------");
        System.out.println("                  修改时间");
        System.out.println("-------------------------------------------");
        Date date = new Date(file.lastModified());
        System.out.println("文件修改时间"+date);
        System.out.println("-------------------------------------------");
        System.out.println("                打印目录结构");
        System.out.println("-------------------------------------------");
        File dir = new File("d:/hanlp");
        showDir(1,dir);
        System.out.println("-------------------------------------------");
        System.out.println("                打印目录下文件");
        System.out.println("-------------------------------------------");
        /**
         * 当亲目录下的目录或文件
         */
        File dir1 = new File("d:/hanlp");
        String[] children = dir1.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    /**
     * 展示目录
     * @param index
     * @param dir
     */
    private static void showDir(int index, File dir) {
        for (int i = 0; i < index; i++) {
            System.out.print("-");
        }
        System.out.println(dir.getName());
        if (dir.isDirectory()){
            File[] list = dir.listFiles();
            for (int i = 0; i < list.length; i++) {
                showDir(index+5, list[i]);
            }
        }
    }
}

package directoryOperate;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 1、文件的模糊查询
 * 2、查看系统根目录
 * 3、查看当前工作目录
 * 4、遍历目录
 *
 * @author czy
 * @date 2020/06/02
 */
public class FuzzyQueryFile{
    public static void main(String[] args){
        System.out.println("---------------------------------------");
        System.out.println("               文件的模糊查询");
        System.out.println("---------------------------------------");
        File dir = new File("d:");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith("a");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("             查看系统根目录");
        System.out.println("---------------------------------------");
        File[] files = File.listRoots();
        System.out.println("系统所有根目录");
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i]+"\t");
        }
        System.out.println("---------------------------------------");
        System.out.println("               查看当前工作目录");
        System.out.println("---------------------------------------");
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);
        System.out.println("---------------------------------------");
        System.out.println("                遍历目录");
        System.out.println("---------------------------------------");
        System.out.println("遍历目录");
        File dir2 = new File("d:/hanlp"); //要遍历的目录
        visitAllDirsAndFiles(dir2);
    }
    public static void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]));
            }
        }
    }
}

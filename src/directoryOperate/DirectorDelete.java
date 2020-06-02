package directoryOperate;

import java.io.File;

/**
 * 删除目录
 */
public class DirectorDelete {
    public static void main(String[] args) throws Exception {
        // 删除当前目录下的 test 目录
        deleteDir(new File("d:/dd/JavaTemp6939686952898951952.javatemp"));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir
                        (new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if (dir.delete()) {
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目录删除失败！");
            return false;
        }
    }
}

package directoryOperate;

import java.io.File;

/**
 * 递归创建
 */
public class Directors {
    public static void main(String[] args) {
        String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
        System.out.println(file.getPath());
    }
}

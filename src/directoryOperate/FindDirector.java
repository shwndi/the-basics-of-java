package directoryOperate;

import java.io.File;
import java.util.ArrayList;

/**
 * 指定目录找文件
 *
 * @author czy
 * @date 2020/06/02
 */
public class FindDirector {
    public static void main(String[] args) {
        File file = new File("../java");
        String[] list = file.list();
        if (list == null){
            System.out.println("there is no file in this director !");
        }else{
            for (int i = 0; i < list.length; i++) {
                String fileName = list[i];
                System.out.println(fileName);
            }
        }
    }
}

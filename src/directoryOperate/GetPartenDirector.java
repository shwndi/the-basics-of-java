package directoryOperate;

import java.io.File;

/**
 * 获取上级目录
 *
 * @author czy
 * @date 2020/06/02
 */
public class GetPartenDirector {
    public static void main(String[] args){
        File file = new File("d:/aa.sql");
        String parentName = file.getParent();
        System.out.println(parentName);
    }
}

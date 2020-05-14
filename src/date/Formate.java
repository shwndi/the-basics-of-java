package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 */
public class Formate {
    public static void main(String[] args) {
        Date date = new Date();
        String formate ="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        String s = sdf.format(date);
        System.out.println(s);
    }
}

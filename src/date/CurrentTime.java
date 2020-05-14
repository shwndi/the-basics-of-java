package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间爱你
 */
public class CurrentTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        String s = sdf.format(new Date());
        System.out.println(s);
    }
}

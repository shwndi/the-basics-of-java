package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间戳转换
 *
 * @author czy
 * @date 2020/04/29
 */
public class LongTime {
    /**
     * 三种方法
     *
     * 1、String sd = sdf.format(Long.parseLong(String.valueOf(timeStamp)));
     * 2、String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
     * 3、String sd = sdf.format(timeStamp);
     * @param args
     */
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss s a");
        String s = String.valueOf(time);
        long l = Long.parseLong(s);
        Date date1 = new Date(l);
        String format1 = spf.format(date1);
        System.out.println(format1);
        System.out.println("---------------------------------------");
        Date date2 = new Date(time);
        String format2 = spf.format(date2);
        System.out.println(format2);
    }
}

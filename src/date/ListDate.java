package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

/**
 * 测试
 */
public class ListDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2020-04-29");
        Date date1 = sdf.parse("2020-04-27");
        Date date2 = sdf.parse("2020-04-28");
        List list1 = new ArrayList();
        list1.add(date);
        list1.add(date1);
        list1.add(date2);
        Date date3 = sdf.parse("2020-04-26");
        Date date4 = sdf.parse("2020-04-27");
        Date date5 = sdf.parse("2020-04-28");
        List list2 = new ArrayList();
        list2.add(date3);
        list2.add(date4);
        list2.add(date5);
        list1.removeAll(list2);
        System.out.println(list1);

    }
}

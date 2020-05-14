package date;

import java.util.Calendar;

public class GetYearMouth {
    public static void main(String[] args){
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int mouth = instance.get(Calendar.MONTH) - 1;
        int date = instance.get(Calendar.DATE);
        int hour = instance.get(Calendar.HOUR);
        int minue = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        int hourOfDay = instance.get(Calendar.HOUR_OF_DAY);
        int dayOfMouth = instance.get(Calendar.DAY_OF_MONTH);
        int fileCount = instance.get(Calendar.FIELD_COUNT);
        int allStyles = instance.get(Calendar.ALL_STYLES);
        instance.get(Calendar.WEEK_OF_MONTH);
    }
}

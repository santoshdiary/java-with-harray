package aftercollectionFramwork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorianCalenderClass {
    public static void main(String[] args) {

        // NORMAL CALENDAR WHICH IS ABSTRACT CLASS .
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // gregorian calendar - which is concrete class which means instance is possible

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        // time zone lists a/c to id
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }

}
package aftercollectionFramwork;
import java.util.*;

/*
Calendar Class in Java---
The calendar class in java provides the methods that helps in converting date between a specific instant in time.
It is an "abstract" class.
Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
We use the static method Calender.getInstance() in order to implement a sub-class.

*/



public class calendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // here getInstance() method used because Calendar class is an abstract class.
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/ Singapore"));
        System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar
        System.out.println( "Current time zone:- " + c1.getTimeZone());

        System.out.println("Current year is :"+ c.get(Calendar.YEAR));

        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK)); // day of the week
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY)); //today's  hours
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));
        // OR

        System.out.println("current time is:"+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getTime());
        System.out.println("date "+c.get(Calendar.DATE));

    }
}

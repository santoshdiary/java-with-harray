package aftercollectionFramwork;

import java.util.Date;





public class timeClass {
    public static void main(String[] args) {
       System.out.println(Long.MAX_VALUE);
       System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}

/*The Date Class in Java
Answer of quiz asked in the previous tutorial:
Question: Is it safe to store the number of milliseconds in a variable of type long?
Answer: Yes, it is absolutely safe to store the number of milliseconds in a variable
of type long because the maximum value that can be stored in long is 9223372036854775807
. You can see that the maximum value of long is huge. Therefore, we do not need to worry a
bout the value of milliseconds. Notice the output of the below code; the value of current time
 in millisecond is 10^6 times smaller than the maximum value of long data type.*/
package datetimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("local time :" + now);

        LocalTime localTime = LocalTime.parse("09:30");
        System.out.println(localTime);



        LocalTime localTime2 = LocalTime.of(10,30);
        System.out.println(localTime2);
        LocalTime localTime3 =localTime2.plus(3, ChronoUnit.HOURS);
        System.out.println(localTime3);

        Boolean isAfter=LocalTime.parse("09:20").isAfter(LocalTime.parse("08:00"));

        System.out.println("is after: "+ isAfter);

        System.out.println("max: "+LocalTime.MAX);
        System.out.println("min: "+LocalTime.MIN);
        System.out.println("midnight: "+LocalTime.MIDNIGHT);
        System.out.println("noon: "+LocalTime.NOON);
    }
}

package datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo2 {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek= LocalDate.parse("2017-03-01").getDayOfWeek();

        System.out.println(dayOfWeek);

        int dayOfMonth = LocalDate.parse("2017-03-01").getDayOfMonth();

        System.out.println("day of month: "+dayOfMonth );

        LocalDate thisYear = LocalDate.now();
        System.out.println(thisYear.isLeapYear());


        boolean isBefore=LocalDate.parse("2017-03-01").isBefore(LocalDate.now());

        System.out.println("is before: "+isBefore);

        boolean isAfter=LocalDate.parse("2017-03-01").isAfter(LocalDate.now());

        System.out.println("is after: "+isAfter);
        System.out.println("-----------------");

        LocalDateTime atStartOfDay = LocalDate.parse("2017-03-01").atStartOfDay();
        System.out.println(atStartOfDay);

        LocalDate with =LocalDate.parse("2017-03-11").with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(with);
    }
}

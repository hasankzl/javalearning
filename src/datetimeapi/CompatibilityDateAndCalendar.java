package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CompatibilityDateAndCalendar {

    public static void main(String[] args) {

        Date date =new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        LocalDate localDate = localDateTime.toLocalDate();

        Calendar calendar = Calendar.getInstance();

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(calendar.toInstant(),ZoneId.systemDefault());

        System.out.println(localDateTime2);
    }
}

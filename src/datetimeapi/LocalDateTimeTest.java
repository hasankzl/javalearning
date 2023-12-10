package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("local time: "+ localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.parse("2023-11-26T10:37:33");
        System.out.println("parse: "+localDateTime2);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println("date: "+ localDate+" time: "+localTime);

        System.out.println(localDateTime.MAX);
        System.out.println(LocalDateTime.MIN);
    }
}

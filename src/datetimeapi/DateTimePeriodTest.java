package datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimePeriodTest {

    public static void main(String[] args) {

        LocalDate initialDate = LocalDate.now();

        LocalDate finalDate =initialDate.plus(Period.ofDays(5));
        System.out.println(finalDate);
        int daysBetween =Period.between(initialDate,finalDate).getDays();
        System.out.println(daysBetween);

        long chronoBetween =ChronoUnit.DAYS.between(initialDate,finalDate);
        System.out.println(chronoBetween);

        System.out.println("----------------");
        LocalTime initialTime = LocalTime.now();
        LocalTime finalTime = initialTime.plus(Duration.ofMinutes(30));
        long seconds = Duration.between(initialTime,finalTime).getSeconds();

        System.out.println(seconds);


        long chronoBetweenMin =ChronoUnit.MINUTES.between(initialTime,finalTime);
        System.out.println(chronoBetweenMin);

    }
}

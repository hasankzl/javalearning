package datetimeapi;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeTest {

    public static void main(String[] args) {

        ZoneId tokyo =ZoneId.of("Asia/Tokyo");
    /**    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.stream().forEach(System.out::println);
*/
        ZonedDateTime zonedDateTimeTokyo =ZonedDateTime.of(LocalDateTime.now(),tokyo);
        System.out.println(zonedDateTimeTokyo);
        LocalDateTime localDateTime=LocalDateTime.of(2015, Month.APRIL,20,06,23);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime,offset);

        System.out.println("offsetdatetime: "+offsetDateTime);
    }
}

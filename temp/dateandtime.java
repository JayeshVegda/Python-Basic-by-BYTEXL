import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.OffsetTime;
import java.time.OffsetDateTime;
import java.time.Clock;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class dateandtime {
    public static void main(String[] args) {
        // LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // LocalTime
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // ZonedDateTime
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Current zoned date and time: " + currentZonedDateTime);

        // OffsetTime
        OffsetTime currentOffsetTime = OffsetTime.now();
        System.out.println("Current offset time: " + currentOffsetTime);

        // OffsetDateTime
        OffsetDateTime currentOffsetDateTime = OffsetDateTime.now();
        System.out.println("Current offset date and time: " + currentOffsetDateTime);

        // Clock
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        System.out.println("Current instant: " + instant);

        // Instant
        Instant currentInstant = Instant.now();
        System.out.println("Current instant: " + currentInstant);

        // Duration
        Duration duration = Duration.ofMinutes(30);
        System.out.println("Duration of 30 minutes: " + duration);

        // Period
        Period period = Period.ofDays(7);
        System.out.println("Period of 7 days: " + period);

        // ZoneId
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Zone ID: " + zoneId);

        // ZoneOffset
        ZoneOffset zoneOffset = ZoneOffset.ofHours(5);
        System.out.println("Zone offset: " + zoneOffset);

        // DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}

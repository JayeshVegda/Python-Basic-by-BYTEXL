import java.time.ZonedDateTime;
import java.time.ZoneId;

public class zone {
    public static void main(String[] args) {
        // Creating a ZonedDateTime object representing current date, time, and time zone
        ZonedDateTime currentDateTimeZone = ZonedDateTime.now();
        System.out.println("Current date, time, and time zone: " + currentDateTimeZone);
        System.out.println("Current date, time, and time zone: " + currentDateTimeZone.getDayOfMonth());
        System.out.println("Current date, time, and time zone: " + currentDateTimeZone.getMonth());
        System.out.println("Current date, time, and time zone: " + currentDateTimeZone.getYear());
        System.out.println("Current date, time, and time zone: " + currentDateTimeZone.getSecond());
        
        // Creating a ZonedDateTime object for a specific date, time, and time zone
        ZonedDateTime eventDateTimeZone = ZonedDateTime.of(2024, 6, 15, 18, 0, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Event date, time, and time zone: " + eventDateTimeZone);
    }
}

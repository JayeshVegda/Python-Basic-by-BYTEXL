import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Creating a LocalTime object representing current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        
        // Creating a LocalTime object for a specific time
        LocalTime meetingTime = LocalTime.of(14, 30);
        System.out.println("Meeting time: " + meetingTime);
    }
}

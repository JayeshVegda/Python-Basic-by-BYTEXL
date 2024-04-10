import java.time.LocalDateTime;

public class a {
    public static void main(String[] args) {
        // Creating a LocalDateTime object representing current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
        
        // Creating a LocalDateTime object for a specific date and time
        LocalDateTime eventDateTime = LocalDateTime.of(2024, 12, 15, 18, 0);
        System.out.println("Event date and time: " + eventDateTime);
    }
}

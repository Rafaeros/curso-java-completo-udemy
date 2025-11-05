import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExerciciosDataEHora {
    
    public static void main(String[] args) {
        // LocalDateTime and basic operations
        LocalDateTime todayDate = LocalDateTime.now();
        System.out.println(todayDate);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String todayDateStr = todayDate.format(fmt);
        System.out.println(todayDateStr);

        fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        todayDateStr = todayDate.format(fmt);
        System.out.println(todayDateStr);

        LocalDateTime dateFromStr = LocalDateTime.parse("23/07/2018 15:42:07", fmt);
        System.out.println(dateFromStr);

        // Global time with timezone
        Instant instant = Instant.now();
        System.out.println(instant);


    }

}

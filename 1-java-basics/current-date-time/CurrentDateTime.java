import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        System.out.println(currentDateTime.format(dateTimeFormat));
    }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    private static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm";

    public static LocalDateTime parseDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_PATTERN);
        try {
            return LocalDateTime.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format. Please use the format " + DATE_FORMAT_PATTERN);
            return null;
        }
    }
}

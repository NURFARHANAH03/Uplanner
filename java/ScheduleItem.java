import java.time.LocalDateTime;

public class ScheduleItem {
    private String matricID;
    private String item;
    private Location location;
    private LocalDateTime start_time;
    private LocalDateTime end_time;

    public ScheduleItem(String matricId, String itemName, Location location, LocalDateTime localDateTime, LocalDateTime dateTime) {
        this.matricID = this.matricID;
        this.item = item;
        this.location = this.location;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public String getMatricID() {
        return matricID;
    }

    public String getItem() {
        return item;
    }

    public Location getLocation() {
        return location;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public LocalDateTime getEnd_time() {
        return end_time;
    }

    public void setStudentId(String matricID) {
        this.matricID = matricID;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }
}


public class Task {

    private Student student_Id;
    private Location location;
    private Date start_time;
    private Date end_time;
    private String tasks;

    public Student getStudent_Id() {
        return student_Id;
    }
    public void setStudent_Id(Student student_Id) {
        this.student_Id = student_Id;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Date getStart_time() {
        return start_time;
    }
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }
    public Date getEnd_time() {
        return end_time;
    }
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
    public String getTasks() {
        return tasks;
    }
    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

}

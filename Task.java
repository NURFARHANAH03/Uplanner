public class Task {

    private int studentId;
    private String className;
    private String startTime;
    private String endTime;

    public Task(int studentId, String className, String startTime,String endTime){
        this.studentId = studentId;
        this.className = className;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStudent(){
        return studentId;
    }
    public String getClassName(){
        return className;
    }
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
}

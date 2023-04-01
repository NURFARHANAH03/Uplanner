import java.util.ArrayList;
public class TaskList {
    public ArrayList<Task> tasks = new ArrayList<>();
    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(Task task){
        tasks.remove(task);
    }



}

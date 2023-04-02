import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
    private final List<ScheduleItem> eventList;
    private final List<ScheduleItem> taskList;


    public Schedule() {
        this.eventList = new ArrayList<>();
        this.taskList = new ArrayList<>();
    }

    public void displayDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day to display (e.g. Monday): ");
        String day = scanner.nextLine();



        // Display events
        System.out.println("Events for " + day + ":");
        displayItems(day, eventList);

        // Display tasks
        if (taskList != null) {
            System.out.println("Tasks for " + day + ":");
            displayItems(day, taskList);
        } else {
            System.out.println("No tasks scheduled for " + day + ".");
        }
    }

    private void displayItems(String day, List<ScheduleItem> items) {
        for (ScheduleItem item : items) {
            if (item.getStart_time() != null && item.getStart_time().getDayOfWeek().toString().equalsIgnoreCase(day)) {
                System.out.println("Student ID: " + item.getMatricID());
                System.out.println("Item: " + item.getItem());
                System.out.println("Location: " + item.getLocation().getPlace());
                System.out.println("Start time: " + item.getStart_time());
                System.out.println("End time: " + item.getEnd_time());
            }
        }
    }

    public void manageDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day to manage (e.g. Monday): ");
        String day = scanner.nextLine();

        System.out.println("1. Add event");
        System.out.println("2. Add task");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1 ->
                // Add event
                    addScheduleItem(eventList);
            case 2 ->
                // Add task
                    addScheduleItem(taskList);
        }
    }

    private void addScheduleItem(List<ScheduleItem> items) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        System.out.print("Enter start time (YYYY-MM-DD HH:mm): ");
        String startTimeString = scanner.nextLine();
        System.out.print("Enter end time (YYYY-MM-DD HH:mm): ");
        String endTimeString = scanner.nextLine();

        ScheduleItem item = new ScheduleItem(studentId, itemName, new Location(location),
                DateUtils.parseDate(startTimeString), DateUtils.parseDate(endTimeString));

        items.add(item);
        System.out.println("Item added successfully.");
    }

}

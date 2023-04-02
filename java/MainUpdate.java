 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////////////*Students*//////////////
        System.out.println("\nCreate UPlanner Account!");

        // Sign up
        Student student = new Student();
        boolean signedUp = student.signUp();

        if (signedUp) {
            System.out.println("You have successfully signed up!");
        } else {
            System.out.println("Sorry, sign up failed.");
            return;
        }

        // Log in
        System.out.println("\nWelcome to UPlanner Log In!");

        boolean loggedIn = student.logIn();

        if (loggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Sorry, log in failed.");
        }

        ////////////*Date*//////////
        System.out.print("(Date)\n");

        //DtList dtl = new DtList();
        Date dt = new Date();

        System.out.print("Enter year : ");
        int yr = scanner.nextInt();
        dt.set_year(yr);

        System.out.print("Enter month [January-December] : ");
        String mh = scanner.next();
        dt.set_months(mh);

        Date dy1 = new Date();
        Date dy2 = new Date();
        Date dy3 = new Date();
        Date dy4 = new Date();
        Date dy5 = new Date();
        Date dy6 = new Date();
        Date dy7 = new Date();

        Date[] day = {dy1, dy2, dy3, dy4, dy5, dy6, dy7};

        for (Date dy : day) {
            System.out.print("Enter day[Monday-Sunday]: ");
            String d = scanner.next();
            dy.set_days(d);

            System.out.print("Enter start time in 2400 system : ");
            int s_time = scanner.nextInt();
            dt.set_start_time(s_time);

            System.out.print("Enter end time in 2400 system : ");
            int e_time = scanner.nextInt();
            dt.set_end_time(e_time);
            //dtl.addDate(dt);

            /////////////*Location*///////////
            Location location = new Location();
            System.out.print("Location : ");
            String place = scanner.next();
            location.setPlace(place);

            ///////////*task*////////////
            TaskList tsk = new TaskList();
            Task task = new Task();
            System.out.print("How many tasks do you want to set?");
            int num = scanner.nextInt();

            int i = 0;
            while (i < num) {
                System.out.print("Enter your task:");
                String tasks = scanner.next();
                task.setTasks(tasks);
                tsk.addTask(task);
                i++;

            }
            System.out.print("Do you want to add any other task? (y/n)");
            String at = scanner.next();
            while (at.equals("y")) {
                System.out.print("Enter your task:");
                String taskStr = scanner.next();
                task.setTasks(taskStr);
                tsk.addTask(task);
                System.out.print("Do you want to add any other task? (y/n)");
                at = scanner.next();
            }
            System.out.print("Do you want to remove any task? (y/n)");
            String ans = scanner.next();
            while (ans.equals("y")){
                System.out.println("Which task do you want to remove?");
                String taskStr = scanner.next();
                Task taskToRemove = new Task();
                taskToRemove.setTasks(taskStr);
                tsk.removeTask(taskToRemove);
                System.out.print("Do you want to remove any other task? (y/n)");
                ans = scanner.next();
            }


            ///////////////*Event*/////////////////
            EventList evt = new EventList();
            Event event  = new Event();
            System.out.print("How many events do you have today?");
            int count = scanner.nextInt();

            int x = 0;
            while (x < count) {
                System.out.print("Enter your event(s):");
                String eventName = scanner.next();
                event.setEvent(eventName);
                evt.addEvent(event);
                x++;

            }

            System.out.print("Do you want to add any other event? (y/n)");
            String ae = scanner.next();
            while (ae.equals("y")){
                System.out.println("Enter your event :");
                String eventStr = scanner.next();
                event.setEvent(eventStr);
                evt.addEvent(event);
                System.out.print("Do you want to add any other event? (y/n)");
                ae = scanner.next();
            }

            System.out.print("Do you want to remove any event? (y/n)");
            String a = scanner.next();
            while (a.equals("y")){
                System.out.println("Which event do you want to remove?");
                String eventStr = scanner.next();
                Event eventToRemove = new Event();
                eventToRemove.setEvent(eventStr);
                evt.removeEvent(eventToRemove);
                System.out.print("Do you want to remove any other event? (y/n)");
                a = scanner.next();
            }
        }
        /////////////*Schedule*///////////// (to display all tasks, locations, dates)



       

        //*Settings*

        //*Reminder
        System.out.println("Reminder");
        Reminder1 rmd1 = new Reminder1();
          rmd1.DisplayReminder1();

        Reminder2 rmd2 = new Reminder2();
          rmd2.DisplayReminder2();
    }


}

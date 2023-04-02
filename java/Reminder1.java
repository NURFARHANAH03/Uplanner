public class Reminder1 extends Date {

    public static void main (String[] args){
        Reminder1 rmd1 = new Reminder1();
        rmd1.get_start_time();
        rmd1.get_start_time();
    }
    public void DisplayReminder1() {
        System.out.println(get_start_time());
        System.out.println(get_end_time());
    }
}

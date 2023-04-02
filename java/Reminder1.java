public class Reminder1 extends Date {

    public static void main (String[] args){
        Reminder1 rmd1 = new Reminder1();
        rmd1.get_start_time();
        rmd1.get_end_time();


    }
        public void DisplayReminder1(){

            System.out.println("Time start:\t"+get_start_time());
            System.out.println("Time End:\t"+get_end_time());
    }
}

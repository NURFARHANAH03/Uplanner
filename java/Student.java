import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}

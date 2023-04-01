import java.util.Scanner;

public class Student {
    private String name;
    private String utpEmail;
    private String matricID;
    private String password;
    private String[] program = {"Chemical Engineering", "Civil Engineering","Computer Engineering", "Electrical Engineering","Material Engineering", "Mechanical Engineering", "Petroleum Engineering",
            "Computer Science", "Information Technology", "Information System", "Business Management", "Petroleum Geoscience", "Applied Chemistry"};
    private String[] yearStudy = {"First Year", "Second Year", "Third Year", "Fourth Year", "Foundation"};
    private String[] levelStudy = {"First Semester", "Second Semester", "Third Semester"};

    public Student() {
        this.name = name;
        this.utpEmail = utpEmail;
        this.matricID = matricID;
        this.password = password;
    }


    public boolean signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Create UPlanner Account----");
        System.out.println("Please enter your name: ");
        this.name = scanner.nextLine();
        System.out.println("Please enter your email (example@utp.edu.my): ");
        this.utpEmail = scanner.nextLine();
        if (!utpEmail.contains("@utp.edu.my")) {
            System.out.println("Error: Email should contain '@utp.edu.my'");
            return false;
        }
        System.out.println("Please enter your student ID: ");
        this.matricID = scanner.nextLine();
        System.out.println("Please enter your password: ");
        this.password = scanner.nextLine();
        System.out.println("Please select your program of study (enter number only): ");
        for (int i = 0; i < program.length; i++) {
            System.out.println(i+1 + ". " + program[i]);
        }
        int programChoice = scanner.nextInt();
        scanner.nextLine(); // to consume the new line character
        if (programChoice < 1 || programChoice > program.length) {
            System.out.println("Error: Invalid program choice");
            return false;
        }
        System.out.println("Please select your year of study (enter number only) : ");
        for (int i = 0; i < yearStudy.length; i++) {
            System.out.println(i+1 + ". " + yearStudy[i]);
        }
        int yearChoice = scanner.nextInt();
        scanner.nextLine(); // to consume the new line character
        if (yearChoice < 1 || yearChoice > yearStudy.length) {
            System.out.println("Error: Invalid year choice");
            return false;
        }
        System.out.println("Please select your level of study (enter number only) : ");
        for (int i = 0; i < levelStudy.length; i++) {
            System.out.println(i+1 + ". " + levelStudy[i]);
        }
        int levelChoice = scanner.nextInt();
        scanner.nextLine(); // to consume the new line character
        if (levelChoice < 1 || levelChoice > levelStudy.length) {
            System.out.println("Error: Invalid level choice");
            return false;
        }
        System.out.println("Sign up successful!");
        return true;
    }

    public boolean logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Log In to Uplanner----");
        System.out.println("Please enter your UTP Email: ");
        String loginEmail = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String loginPassword = scanner.nextLine();
        if (!loginEmail.equals(utpEmail) || !loginPassword.equals(password)) {
            System.out.println("Error: Invalid Email or Password");
            return false;
        }
        System.out.println("Log in successful!");
        return true;
    }

}

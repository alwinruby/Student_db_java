package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter a student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Students first name: ");
        this.firstName= in.nextLine();

        System.out.println("Enter Students last name: ");
        this.lastName= in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter Student class level : ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " - " + gradeYear + " - " +studentID);

    }

    //Generate an ID
    private void setStudentID() {
        //Grade Level ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do{
            System.out.println("Enter the name of the course to enroll in (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
//                System.out.println("BREAK");
                break;
            }

        }while (1 != 0);


        System.out.println("ENROLLED IN: " + courses);
//        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status
}

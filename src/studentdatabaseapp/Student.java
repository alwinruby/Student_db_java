package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse;


    //Constructor: prompt user to enter a student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Students first name: ");
        this.firstName= in.nextLine();

        System.out.println("Enter Students last name: ");
        this.lastName= in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter Student class level : ");
        this.gradeYear = in.nextInt();

        System.out.println(firstName + " " + lastName + " - " +gradeYear);
    }
    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay tuition

    //Show status
}

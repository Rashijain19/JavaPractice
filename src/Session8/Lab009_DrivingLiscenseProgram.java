package Session8;

import java.util.Scanner;

public class Lab009_DrivingLiscenseProgram {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = user.nextInt();
        if (age <=18)
        {
            System.out.println("You are not eligible for the Driving Liscense");
        }
        else
            System.out.println("You are eligible for the Driving Liscence");

    }
}

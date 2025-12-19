package Session8;

import java.util.Scanner;

public class Lab008_UserInputConcept {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the year:");
        double year = user.nextDouble();
        if (year%4 ==0 && year%100 !=0 && year%400 == 0)
        {
        System.out.println(year+" is leap year");
        }
        else
        {
        System.out.println(year+"is not a leap year");
        }

    }
}

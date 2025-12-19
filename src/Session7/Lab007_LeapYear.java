package Session7;

import java.util.Scanner;

//WAP to print leap year i.e. 366
public class Lab007_LeapYear {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the year:");
        double year = user.nextInt();

         if (year%4 ==0 && year%100 !=0 && year %400 == 0)
        {
            System.out.println("The Number is Leap Year");
        }
        else
         {
             System.out.println("The Number is not a Leap Year");
         }
    }
}

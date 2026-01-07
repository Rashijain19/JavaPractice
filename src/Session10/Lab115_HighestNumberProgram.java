
package Session10;

import java.util.Scanner;

public class Lab115_HighestNumberProgram {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = user.nextInt();

        System.out.println("Enter the Second Number:");
        int num2 = user.nextInt();

        System.out.println("Enter the Third Number:");
        int num3 = user.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println(num1);
        }
        else if (num2>num3 && num2>num1)
        {
            System.out.println(num2);
        }
        else{
            System.out.println("The Highest number is:" +num3);
        }
    }
}


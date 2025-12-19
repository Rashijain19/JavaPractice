package Session8;

import java.util.Scanner;

public class Lab110_CalculatorProgram {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number:");
        System.out.println("Enter the second number:");
        double a = user.nextDouble();
        double b = user.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
    }
}

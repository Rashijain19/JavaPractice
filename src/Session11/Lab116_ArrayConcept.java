package Session11;

import org.w3c.dom.ls.LSOutput;

public class Lab116_ArrayConcept {
    public static void main(String[] args) {
        double[] salary = {103232, 222323, 3323, 39302};
        double highest_salary = salary[1];

        for (int i = 0; i < salary.length; i++)
        {
            if (salary[i] > highest_salary)
            {
//        highest_salary = max_salary[i];}
            }
            System.out.println("The highest Salary is:" + highest_salary);
        }
    }
}

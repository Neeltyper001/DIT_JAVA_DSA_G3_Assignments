package assignment1;
import java.util.Scanner;

public class salarySlip {
    public static void main(String args []){        
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter the basic salary of the employee: Rs. ");
        float basicSalary = input.nextInt();
        System.out.println();
        
        float HRA = (float) (0.5 * basicSalary);
        float TA = (float) (0.3 * basicSalary);
        float MA = (float) (0.25 * basicSalary);
        float PF = (float) (0.1 * basicSalary);
        float grossSalary = basicSalary + HRA + TA + MA + PF;
        float tax = (float)0.1 * grossSalary;
        float netSalary = grossSalary - tax - PF;

        input.close();

        System.out.println("******************************** Salary Slip **************************************");
        System.out.println("*");
        System.out.println("* Basic Salary: "+(basicSalary)+"\t\t\t\t");
        System.out.println("* HRAA: "+(HRA)+"\t\t\t\t");
        System.out.println("* TA: "+(TA)+"\t\t\t\t");
        System.out.println("* MA: "+(MA)+"\t\t\t\t");
        System.out.println("* Gross Salary: "+(grossSalary)+"\t\t\t\t");
        System.out.println("* tax: "+(tax)+"\t\t\t\t");
        System.out.println("* Net Salary: "+(netSalary)+"\t\t\t\t");
        System.out.println();

        
    }
}

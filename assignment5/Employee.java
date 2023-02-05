package DIT_JAVA_DSA_G3_Assignments.assignment5;

import java.util.*;

class Employee {

    private int empId = 10001;
    private String empName = "Amit Srivastava";
    private double BS = 10000;
    private double employerSal;
    private double HRA;
    private double DA;
    private double TA;
    private double MA;
    private double GS;
    private double PF;
    private double TAX;

    public void getInput(int empId , String empName , double employerSal ){
        this.empId = empId;
        this.empName = empName;
        this.employerSal = employerSal;
    }

    public void calculator(){
        HRA = 0.15 * BS;
        DA  = 0.20 * BS;
        MA =  0.20 * MA;
        GS = HRA + DA + MA;
        PF = (0.05 * BS) + (0.05 * employerSal); 
        GS = BS + HRA + DA + TA + MA;
        
        if(employerSal <= 500000){
            TAX = 0.10 * GS;
        }
        else if(500000 < employerSal && employerSal <= 700000){
            TAX = 0.20 * GS;
        }
        else if(700000 < employerSal && employerSal <= 900000){
            TAX = 0.30 * GS;
        }

    }

    public void printSalSlip(){
        System.out.println();
        calculator();
        System.out.println("DATED: "+(new Date()));
        System.out.println("**********************************************************************");
        System.out.println("| EmpId | Employee Name |  Basic Salary |  Gross Salary | Net Salary |");
        System.out.println("**********************************************************************");
        System.out.println("| "+empId+" | "+empName+" | Rs."+BS+"   | Rs."+GS+"    | Rs."+(GS - TAX - PF)+"  |");
        System.out.println("**********************************************************************");
    }



}

class Driver {
    public static void main (String args [] ){
        Employee empObj = new Employee();
        empObj.getInput(1001 , "Amit Srivastava" , 50000 );
        empObj.printSalSlip();
    }
}
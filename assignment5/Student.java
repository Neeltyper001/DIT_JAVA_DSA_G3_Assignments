package DIT_JAVA_DSA_G3_Assignments.assignment5;
import java.util.*;

public class Student {
    
    private int rollNo = 1001;
    private String stdName;
    private float sub1;
    private float sub2;
    private float sub3;
    private float percentage;
    private char grade;

    public void getInfo(String stdName , float sub1 , float sub2, float sub3){
        this.stdName = stdName;
        this.sub1 = (float)sub1;
        this.sub2 = (float)sub2;
        this.sub3 = (float)sub3;
    }

    public void getPercentageAndGrade(){
        percentage = ((sub1 + sub2 + sub3)/300) * 100;

        if(percentage >= 90){
            grade = 'A';
        }

       else if(percentage  < 90 && percentage >=70){
            grade = 'B';
        }
       else if(percentage  < 70 && percentage >=60){
            grade = 'C';
        }
       else if(percentage  < 60 && percentage >=50){
            grade = 'D';
        }
       
        else
            grade = 'F';
    }
    

    public void printResult(){
        System.out.println();
        System.out.println("REPORT CARD");
        getPercentageAndGrade();
        System.out.println("*****************************************************************************");
        System.out.println("| RollNo | Student Name | Marks_1  | Marks_2 | Marks_3 | Percentage | Grade |");
        System.out.println("*****************************************************************************");
        System.out.println("| "+rollNo+" | "+stdName+" | "+sub1+"    | "+sub2+"   |   "+sub3+"  | "+percentage+"  |   "+grade+"   |");
        System.out.println("*****************************************************************************");
    }
}

  class Driver2{
    public static void main (String args []){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String stdName = input.nextLine();
        System.out.print("Enter the marks of the three subjects: ");
        float sub1 = input.nextFloat();
        float sub2 = input.nextFloat();
        float sub3 = input.nextFloat();

        input.close();

        Student stdObj = new Student();
        stdObj.getInfo(stdName , sub1, sub2 , sub3);
        stdObj.printResult();
    }
}
package DIT_JAVA_DSA_G3_Assignments.assignment2;
import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner marksInput = new Scanner(System.in);
        System.out.println("__Enter the marks of the student for 3 subjects__");
        int marks1 = marksInput.nextInt();
        int marks2 = marksInput.nextInt();
        int marks3 = marksInput.nextInt();
        marksInput.close();

        int TotalMarks = marks1 + marks2 + marks3;

        if(TotalMarks > 100){
            System.out.println("Invalid marks input!! , marks should be such that Total Marks should be <=100 ");
        }

        else{
            
            if(TotalMarks >= 90){
                System.out.println("A grade with "+TotalMarks+"%");
            }
    
           else if(TotalMarks  < 90 && TotalMarks >=70){
                System.out.println("B grade with "+TotalMarks+"%");
            }
           else if(TotalMarks  < 70 && TotalMarks >=60){
                System.out.println("C grade with "+TotalMarks+"%");
            }
           else if(TotalMarks  < 60 && TotalMarks >=50){
                System.out.println("D  grade with "+TotalMarks+"%");
            }
           
            else
                System.out.println("F grade with "+TotalMarks+"%");
        }
        
    }
}

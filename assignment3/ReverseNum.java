package DIT_JAVA_DSA_G3_Assignments.assignment3;
import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
                    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int num = sc.nextInt();        
        sc.close();

        System.out.print("Reversed num: ");

        for(int temp = num ; temp!=0; temp/=10){
            System.out.print(temp % 10);            
        }

    }
}
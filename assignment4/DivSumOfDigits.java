package DIT_JAVA_DSA_G3_Assignments.assignment4;
import java.util.*;

public class DivSumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =  sc.nextInt();
        int sum = 0;
        sc.close();

        for(int temp = num ; temp!=0; temp/=10){
            sum += temp%10;
        }

        if(num % sum == 0){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}

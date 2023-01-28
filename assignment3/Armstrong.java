package assignment3;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int countDigits = 0 , divisor=0 , quotient=0 , remainder=0, sum=0;            
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int num = sc.nextInt();
        sc.close();
        
        int substNum = num;

        for(int temp = num ; temp!=0; temp/=10){
            ++countDigits;            
        }

        divisor = (int)Math.pow(10,countDigits - 1);
        
        for(int i=0; i<countDigits; i++){
            quotient = num / divisor;
            remainder = num % divisor;
            divisor /= 10;
            num = remainder;
            sum += (int)Math.pow(quotient,countDigits);
            // System.out.print(quotient + " ");
        }

        if(sum == substNum){
            System.out.println("An Armstrong number !!");
        }

        else{
            System.out.println("Not an Armstrong number !!");
        }
    }
}

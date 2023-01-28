package assignment3;
import java.util.*;

public class OddEvenSum {
    public static void main(String[] args) {
        int countDigits = 0 , divisor=0 , quotient=0 , remainder=0 , sumEven=0 , sumOdd=0;            
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int num = sc.nextInt();

        sc.close();

        for(int temp = num ; temp!=0; temp/=10){
            ++countDigits;            
        }

        divisor = (int)Math.pow(10,countDigits - 1);
        
        for(int i=0; i<countDigits; i++){
            quotient = num / divisor;
            remainder = num % divisor;
            divisor /= 10;
            num = remainder;
            System.out.print(quotient + " ");           
            
            if(i%2 == 0){
                sumOdd += quotient;
            }

            else{
                sumEven += quotient;
            }
        }
        System.out.println();
        System.out.print("Sum of digits at odd places: "+sumOdd+"\nSum of digits at even places: "+sumEven);
    }
}

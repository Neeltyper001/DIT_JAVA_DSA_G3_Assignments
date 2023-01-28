package assignment1;
import java.util.Scanner;

public class si {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Principal amount: Rs. ");
        float principalAmount = input.nextFloat();      // principalAmount userInput

        System.out.print("Enter the rate of interest: ");
        float rate = input.nextFloat();                 // Rate of interest userInput

        System.out.print("Enter the time : ");
        float time = input.nextFloat();                 // time  userInput
        
        input.close();                                  // closing the input stream

        System.out.print("The simple interest is: "+(principalAmount * rate * time));
    }
}

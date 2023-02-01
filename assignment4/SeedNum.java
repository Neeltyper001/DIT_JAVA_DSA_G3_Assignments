package DIT_JAVA_DSA_G3_Assignments.assignment4;

import java.util.*;
public class SeedNum {
    
    public static void main(String[] args) {
        int prod = 1,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers X and Y respectively: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        if(num1 > num2){
            temp = num2;            
        }

        else{
            temp = num1;
        }

        for(  ; temp!=0 ; temp/=10){
            prod *= temp%10;
        }

        if(num1 > num2){
            if(num2 * prod == num1){
                System.out.println("YES, "+num2+" is the seed of "+num1);
            }
            
            else{
                System.out.println("No1");
            }
        }

        else{
            if(num1 * prod == num2){
                System.out.print("YES, "+num1+" is the seed of "+num2);
            }

            else{
                System.out.println("No2");
            }
        }
    }
}

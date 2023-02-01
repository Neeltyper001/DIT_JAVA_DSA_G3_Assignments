package DIT_JAVA_DSA_G3_Assignments.assignment4;

import java.util.*;
public class Prime {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        
        if(num == 1){
            System.out.println("Not a prime");
        }

        if( num == 2 || num ==3){
            System.out.println("Is a prime");            
        }

        if( num % 2 == 0 || num % 3 ==0){
            System.out.println("Not a prime");
        }

        for(int i=5; i*i <= num ; i +=6 ){
            if(num % i == 0 || num % (i+2) == 0){
                System.out.println("Not a prime");
            }
        }

        System.out.println("Is a prime");
    }
}

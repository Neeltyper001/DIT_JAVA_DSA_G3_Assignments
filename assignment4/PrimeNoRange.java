package DIT_JAVA_DSA_G3_Assignments.assignment4;

import java.util.*;
public class PrimeNoRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which prime no. has to be determined: ");
        int num = sc.nextInt();
        sc.close();
        System.out.print("The Prime numbers are: ");

        for(int i=2; i<=num ; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){

                if( i % j == 0 && i != 2 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}

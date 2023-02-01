package DIT_JAVA_DSA_G3_Assignments.assignment4;

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        int count = 0 , rev = 0; 
        boolean flag = true;
        System.out.print("Enter the number: ");
        int input = sc.nextInt();                
        sc.close();

        for(int temp = input; temp!=0 ; temp/=10){
            if(flag){    
                rev += temp%10;                
                flag = false;
                count++;
            }

            else{                
                rev = (rev*10)+ (temp%10);                
                count++;
            }
        }
        System.out.println(rev);
    }
}

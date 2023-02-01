package DIT_JAVA_DSA_G3_Assignments.assignment4;
import java.util.*;

public class SumOfSeriesN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter the total number of term: ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("Series generated: ");

        for(int i=0 ; i<n; i++){
            if(i==0){
                System.out.print("1 + ");
                sum+=1;
            }

            else if(i == n-1){
                System.out.print("1/"+(1+i)+" ");
                sum += (double)1/(1+i);
            }

            else {
                System.out.print("1/"+(1+i)+" + ");
                sum += (double)1/(1+i);
            }
        }
        System.out.println();
        System.out.println("The sum of the series is: "+sum);
    }
}

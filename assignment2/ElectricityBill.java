package DIT_JAVA_DSA_G3_Assignments.assignment2;
import java.util.*;

public class ElectricityBill {

    public static void main(String args []){

        Scanner unitInput = new Scanner(System.in);
        System.out.print("Enter the total units consumed: ");
        int unit = unitInput.nextInt();
        unitInput.close();

        if(unit < 200){
            System.out.println("Bill generated @ per unit : Rs. "+unit); 
            System.out.println();           
        }

        else if(unit >= 200 && unit < 400 ){
            System.out.println("Bill generated @ 1.2 per unit: Rs. "+(1.2*unit));
            System.out.println();
        }
        else if(unit >= 400 && unit < 600 ){
            System.out.println("Bill generated @ 1.5 and surcharge per unit: Rs. "+((1.5 * unit)+(1.5 * unit *1.5)));
            System.out.println();
        }
        else if(unit >= 400 && unit < 600 ){
            System.out.println("Bill generated @ 1.8 per unit: Rs. "+((1.8 * unit)+(1.8 * unit *1.5)));
            System.out.println();
        }
        else {
            System.out.println("Bill generated @ 2.0 per unit: Rs. "+((2.0 * unit)+(2.0 * unit *1.5)));
            System.out.println();
        }
    }
}
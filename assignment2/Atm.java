import java.util.*;

public class Atm {
    public static void main(String[] args) {
        
        var Bal = 2300.02;

        System.out.println("*********************** WELCOME TO ATM **************************");
        System.out.println();
        System.out.println("* Press 1 to withdraw Money                                     *");
        System.out.println();
        System.out.println("* Press 2 to deposit Money                                      *");
        System.out.println();
        System.out.println("* Press 3 to check Balance                                      *");
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println();

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your choice here: ");
        short choice = inp.nextShort();
        

        switch(choice){

            case 1:  System.out.println("Enter the amount to withdraw: ");
                     var w_amount  = inp.nextDouble();

                     if(w_amount > Bal){
                        System.out.print("The amount exceeds your current balance !!");
                     }

                     else{
                        System.out.println("Debited amount of "+w_amount+" New Balance: "+(Bal - w_amount));
                     }
                     break;

            case 2:  System.out.print("Enter the amount to be deposited: ");
                     var d_amount  = inp.nextDouble();

                    System.out.println("Credited amount of "+d_amount+" New Balance: "+(Bal + d_amount));
                     
                     break;

            case 3:  System.out.println("Current Balance: "+Bal);            
                     break;
            
            default: System.out.println("Invalid input !!!");
        }
        
        inp.close(); 
    }

}

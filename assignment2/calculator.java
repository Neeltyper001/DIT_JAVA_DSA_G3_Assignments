package DIT_JAVA_DSA_G3_Assignments.assignment2;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        
        System.out.println("*********************** WELCOME TO ATM **************************");
        System.out.println();
        System.out.println("* Press 0 to add                                                 *");
        System.out.println();
        System.out.println("* Press 1 to sub                                                 *");
        System.out.println();
        System.out.println("* Press 2 to multiplication                                      *");
        System.out.println();
        System.out.println("* Press 3 to division                                            *");
        System.out.println();
        System.out.println("* Press 4 to perform cube                                        *");
        System.out.println();
        System.out.println("* Press 5 to find absolute                                       *");
        System.out.println();
        System.out.println("* Press 6 to find power                                          *");
        System.out.println();
        System.out.println("* Press 7 to Decimal to Binary                                   *");
        System.out.println();
        System.out.println("* Press 8 to Decimal to Hexa                                     *");
        System.out.println();
        System.out.println("* Press 9 to Binary to Octa;                                      *");
        System.out.println();
        System.out.println("******************************************************************");
        System.out.println();

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your choice here: ");
        short choice = inp.nextShort();

        switch(choice){

                case 0 : System.out.print("Enter the two numbers: ");
                         Integer sumFirst = inp.nextInt();
                         Integer sumSecond = inp.nextInt();
                         System.out.println("The sum is: "+(sumFirst + sumSecond));
                         break;  

                case 1 : System.out.print("Enter the two numbers: ");
                         Integer subFirst = inp.nextInt();
                         Integer subSecond = inp.nextInt();
                         System.out.println("The sub is: "+(subFirst - subSecond));
                         break;   

                case 2 : System.out.print("Enter the two numbers: ");
                         Integer mulFirst = inp.nextInt();
                         Integer mulSecond = inp.nextInt();
                         System.out.println("The multiplication is: "+(mulFirst * mulSecond));
                         break;  

                case 3 : System.out.print("Enter the two numbers: ");
                         Integer divFirst = inp.nextInt();
                         Integer divSecond = inp.nextInt();
                         System.out.println("The division is: "+(divFirst / divSecond));
                         break;  

                case 4 : System.out.print("Enter the number: ");
                         Integer cubNum = inp.nextInt();
                         System.out.println("The cube is: "+(Math.pow(cubNum,3)));
                         break;  

                case 5 : System.out.print("Enter the number: ");
                         Integer absNum = inp.nextInt();                
                         System.out.println("The absolute value is: "+(Math.abs(absNum)));
                         break;  

                case 6 : System.out.print("Enter the number: ");
                         Integer toBeBinary = inp.nextInt();                         
                         System.out.println("The Binary :"+(Integer.toBinaryString(toBeBinary)));
                         break;   
                                              
                case 7 : System.out.print("Enter the number: ");
                         Integer toBeHexa = inp.nextInt();                         
                         System.out.println("The Hexa is:"+(Integer.toHexString(toBeHexa)));
                         break;    

                case 8 : System.out.print("Enter the number: ");
                         Integer toBeOctal = inp.nextInt();                         
                         System.out.println("The Hexa is:"+(Integer.toOctalString(toBeOctal)));
                         break;    

                        }
        inp.close();
    }
}

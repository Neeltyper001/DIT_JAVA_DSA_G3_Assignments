import java.util.*;

public class HotelMenu {
    public static void main(String[] args) {

        System.out.println("*********************** WELCOME TO SPICY-O-SAUCE ***************");
        System.out.println();
        System.out.println("* Pizza:  (To order press 1)                    Price: Rs. 100 *");
        System.out.println();
        System.out.println("* Burger: (To order press 2)                    Price: Rs.  90 *");
        System.out.println();
        System.out.println("* Fish Curry: (To order press 3)                Price: Rs.  80 *");
        System.out.println();
        System.out.println("* Manchurian: (To order press 4)                Price: Rs.  70 *");
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>____ Enter your choice Below___ >>>>>>>>>>>>>>>>>");
        System.out.print("Your choice: ");
        short choice = input.nextShort();
        input.close();
        System.out.println();

        switch(choice){

            case 1:  System.out.println("Here's your 'PIZZA' ");
                     System.out.println("Bill: Rs. 100");
                     break;
            case 2:  System.out.println("Here's your 'Burger' ");
                     System.out.println("Bill: Rs. 90");
                     break;
            case 3:  System.out.println("Here's your 'Fish Curry' ");
                     System.out.println("Bill: Rs. 80");
                     break;
            case 4:  System.out.println("Here's your 'Manchurian' ");
                     System.out.println("Bill: Rs. 70");
                     break;
            
            default: System.out.println("Invalid input !!!");
        }
        
    }
}
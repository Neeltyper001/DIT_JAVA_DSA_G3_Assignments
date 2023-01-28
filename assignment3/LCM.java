
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        int lcm=1, temp1 = 0,temp2 = 0;
        Scanner sc = new Scanner(System.in);
        boolean loopOnOff = true;

        while(loopOnOff){
            System.out.print("You want to continue for LCM [y/n] ? ");
            char ch = sc.next().charAt(0);
            switch(ch){

                case 'y' :  System.out.print("Enter the nums: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                        
                if(num1 == 0 || num2 == 0){
                    System.out.println("Cannot find the L.C.M for 0, it doesn't exist!!");
                    System.out.println();
                }
        
                else{
                    temp1 = Math.abs(num1);
                    temp2 = Math.abs(num2);             
            
                    for(int i=2; i<=temp1 || i<=temp2; i++){
                       
                        if(temp1 % i == 0 || temp2 % i == 0){
            
                            if((temp1 % i) == 0){
            
                                if((temp1 % i) == 0 && (temp2 % i) == 0){
                                    lcm *= i;
                                    temp1 /= i;
                                    temp2 /= i;                                               
                                }
                                
                                else{
                                    lcm *= i;
                                    temp1/= i;
                                }
                            }
                
                          else if(temp2 % i == 0){
                            if((temp1 % i) == 0 && (temp2 % i) == 0){
                                lcm *= i;
                                temp1 /= i;
                                temp2 /= i;                                               
                            }
            
                            else{
            
                                lcm *= i;
                                temp2 /= i;
                            }
                        }
            
                            i = 1;
                        }
                       
                    }        
            
                    System.out.println("The lcm of "+num1+" and "+num2+" is "+lcm);
                    System.out.println();        
                }
        
                break;
                
                case 'n' : System.out.println("Exited!!!");
                            System.exit(0);
                            sc.close();
                            break;

                default: System.out.println("Invalid response !!!");
                        System.out.println();
            }

        }

    }
}

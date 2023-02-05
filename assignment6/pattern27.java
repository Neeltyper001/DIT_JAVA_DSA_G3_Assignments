package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern27 {
    public static void main(String[] args) {
        int row=0;
        int col=4;
        for(int i=0; i<5; i++){
            for(int j=0 ; j<5; j++){
                if((i == row && j == col) || (j == 4)){
                    
                    System.out.print("* ");
                }
                else if(i == 3){
                    System.out.print("  ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            row++;
            col--;
        }
    }
}

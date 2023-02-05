package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern26 {

    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                if((i == row && j == col) || (j == 3)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            row++;
            col++;
        }
    }
}

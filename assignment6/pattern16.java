package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern16 {
    public static void main(String[] args) {

        int colEnd = 0; 
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                if( (2<=i && i<=3) && (0 < j && j<colEnd)){
                    System.out.print("  ");
                }
                else{

                    System.out.print("* ");
                }
            }
            System.out.println();
            colEnd++;
        }
    }
}

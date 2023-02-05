package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern17 {
    public static void main(String[] args) {
        int endCol = 4;
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                if((i<5 && i>=3 ) && (0<j && j<endCol)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            endCol--;
        }
    }
}

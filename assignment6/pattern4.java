package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern4 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for(int j=5; j>i; j--){
                System.out.print("  ");
            }
            for(int k=0; k<i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern20 {
    public static void main(String[] args) {
        int colEnd = 4;
        for(int i=5; i>0; i--){
            for(int j=5; j>i; j--){
                System.out.print("  ");
            }
            for(int k=0; k<i; k++){
                if((i<5 && i>2) && (0<k && k<colEnd)){
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                     }
            }

            System.out.println();
            colEnd--;
        }
    }

}

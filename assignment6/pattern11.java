package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern11 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for(int j=5; j>i; j--){
                System.out.print("  ");
            }
            for(int k=0; k<i; k++){
                System.out.print("* ");
            }

            for(int l=0; l<i-1; l++){
                System.out.print("* ");
            }
            

            System.out.println();
        }
      
        for(int i=4; i>0 ; i--){
            for(int j=0; j<i-1; j++){
                System.out.print("  ");
            }

            for(int k=5; k>=i; k-- ){
                System.out.print("* ");
            }

            for(int l=5; l >i; l--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

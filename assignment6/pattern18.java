package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern18 {
    public static void main(String[] args) {
        int colEnd = 5;
        for(int i=5; i>0; i--){
            for(int j=0; j<i-1; j++){
                System.out.print("  ");
            }

            for(int k=5; k>=i; k--){
                if((4>i && i>=2) && (5>k && k>colEnd )){
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

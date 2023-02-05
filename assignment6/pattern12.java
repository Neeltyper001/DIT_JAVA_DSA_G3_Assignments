package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern12 {
    public static void main(String[] args) {
        // for(int i=5; i>0; i--){
        //     for(int j=5; j>=i; j--){
        //         System.out.print("* ");
        //     }

        //     for(int k=0 ; k<i-1; k++){
        //         System.out.print("  ");
        //     }

        //     for(int k=0; k<i-1; k++){
        //         System.out.print("  ");
        //     }

        //     for(int l=5; l>=i; l--){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        int colStart = 0;
        int colEnd = 10;
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                if( (colStart < j && j<colEnd - 1) && (0 <= i && i<4) ){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            colStart++;
            colEnd--;
        }
    }
}

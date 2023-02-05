package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern14 {
    public static void main(String[] args) {
    
        int colStart = 4;
        int colEnd = 5;
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                if((colStart < j && j <colEnd) && (1<=i && i<=4) ){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            colEnd++;
            colStart--;
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                if( (colStart+1< j && j<colEnd - 1) && (0 <= i && i<4) ){
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

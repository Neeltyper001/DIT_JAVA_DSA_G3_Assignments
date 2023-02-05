package DIT_JAVA_DSA_G3_Assignments.assignment6;

public class pattern25 {
    public static void main(String[] args) {
        int leftRow = 0;
        int leftCol = 0;
        int rightRow = 0;
        int rightCol = 8;

            for(int i=0; i<4; i++){
                for(int j=0 ; j<9; j++)
                {
                    if((i == leftRow  && j == leftCol) || (i==rightRow && j == rightCol)){
                        
                        System.out.print("* ");
                    }

                    else if( i == 0){
                        System.out.print("* ");
                    }

                    else{
                        System.out.print("  ");
                        
                    }
                }

                System.out.println();
                leftRow++;
                leftCol++;
                rightRow++;
                rightCol--;
            }

             leftRow = 0;
             leftCol = 4;
             rightRow = 0;
             rightCol = 4;
    
                for(int i=0; i<5; i++){
                    for(int j=0 ; j<9; j++)
                    {
                        if((i == leftRow  && j == leftCol) || (i==rightRow && j == rightCol)){
                            
                            System.out.print("* ");
                        }
    
                        else if( i == 4){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                            
                        }
                    }
    
                    System.out.println();
                    leftRow++;
                    leftCol--;
                    rightRow++;
                    rightCol++;
                }
    

    }
}

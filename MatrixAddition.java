import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {

        int marks1 [][] = new int[3][3];
        int marks2 [][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        // -------------MATRIX 1 INPUT DATA ELEMENTS -------------
        System.out.println("Enter 1st matrix element");   
        for(int i=0; i<marks1.length;i++){
             for(int j=0; j<marks1.length;j++){
               marks1[i][j]= sc.nextInt();
             }
        }
        // -------------MATRIX 2 INPUT DATA ELEMENTS -------------
        System.out.println("Enter 2nd matrix element");   
        for(int i = 0; i<marks2.length;i++){
                 for(int j = 0; j<marks2.length; j++){
                    marks2 [i] [j] = sc.nextInt(); 

                }
        }
       // -------------MATRIX 3 FOR ADDING MATRIX-1 AND MATRIX-2 DATA ELEMENTS -------------
    int total [] [] = new int[3][3];
               
        for(int i=0; i<total.length;i++){
            for(int j=0; j<total.length;j++){
           total[i][j] = marks1[i][j] + marks2[i][j];
            }
       }


    // -------------PRINTING THE FINAL MATRIX DATA ELEMENTS -------------
    System.out.println("Additon of two matrix");
       for(int i=0; i<total.length;i++){
        for(int j=0; j<total.length;j++){
            System.out.print(total[i][j] +" ");
        }
        System.out.println();
   }



    }
}

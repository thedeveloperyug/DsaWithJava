// Program to sort an array in java

import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0]=71;
        marks[1]=81;
        marks[2]=15;
        marks[3]=17;
        marks[4]=188;

        for(int i =0; i<marks.length; i++){
            for(int j=i+1; j<marks.length; j++){
                if(marks[i]>marks[j]){
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp; 
                }
                }
       
            System.out.print( marks[i]+" ");
        }

            // ---------------Another sorting method from java.util class
            // Arrays.sort(marks);
            // System.out.print(Arrays.toString( marks)+" ");
        
    }
    
}

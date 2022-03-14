import java.util.*;

public class ArrayListExample {

       public static void main(String[] args){

        ArrayList<Integer> table = new ArrayList<>();
        //--------add element-----------
        table.add(2);
        table.add(4);
        table.add(6);
        table.add(8);
        table.add(10);
        table.add(12);
        table.add(14);
        table.add(16);
        table.add(18);
        table.add(20);
        System.out.println(table);
     //------reverse element or descending order------  

    Collections.reverse(table);
    System.out.print("Numbers in Descending Order: " + table);

    //---------get element-------
    int element =table.get(2);
    System.out.print("\n get element : " + element);

    //------add element in between------------
    table.add(5,2);
    System.out.println("\n add element in between: " + table);

    //--------------set element----------------
    table.set(3,5);
    System.out.println("\n set element: " + table);
    //---------------delete element---------------
    table.remove(2);
    System.out.println("\n delete element: " + table);
    //---------size element---------------------------
    int size= table.size();
    System.out.println("\n size element: " + size);

    //--------loop---------------------
    for(int i=0; i<table.size(); i++){
        System.out.print("\n" + table.get(i));
    }
    System.out.println();

    //----------sorting element---------
     Collections.sort(table);
     System.out.println("\n sorting element: " + table);

        }
}

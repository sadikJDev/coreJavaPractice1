
package examPractice;

import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
//        arrayForEach();

practiceArray();

    }
    public static void arrayForEach(){
        Integer [][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };
        
        System.out.println("Assending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val);
            System.out.println(Arrays.toString(val));
        }
        
        System.out.println("Dccending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val, Collections.reverseOrder());
            System.out.println(Arrays.toString(val));
        }
    }
    
    public static void practiceArray(){
        Integer [] [] myArrays = {
            {8,2,9,3},
            {7,3,6,2},
            {5,7,2,4}
        };
        System.out.println("Assending order :");
        for(Integer [] val : myArrays){
            Arrays.sort(val);
            System.out.println(Arrays.toString(val));
        }
        
        System.out.println("Descending Order :");
        for(Integer [] val : myArrays){
            Arrays.sort(val, Collections.reverseOrder());
            System.out.println(Arrays.toString(val));
        }
        }
}




        
  
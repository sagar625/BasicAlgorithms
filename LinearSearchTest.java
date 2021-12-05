import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class performs a linear search on an array of 20 random integers in the 
 * range 1 to 100 to discover whether or not it contains an integer input from
 * the keyboard.
 *
 * @author Jing Hua Ye
 * @date Nov/6/2021
 * @version 1.0
 */
 class LinearSearchTest {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        //Task: create an array of 20 random integers between 1 to 100 
        //to-complete

        //Task: display array as below: for example [-1, 10, 40, 30]
        //Hint: use the Arrays class, but which method will output in such a format?
        //to-complete      
         int[] array = new int[MAX_SIZE];
         for (int i = 0; i < array.length; i++)
             array[i] = generator.nextInt(100) + 1;
         System.out.println(Arrays.toString(array));
         System.out.println("Please enter an integer value ( -1 to close the program): ");
         int searchKey = input.nextInt();
         if (searchKey == -1) {
             System.out.println("You choose to exit");
             System.exit(0);
         }
        //Task: repeatedly input an integer from user: -1 terminates the program
        //after reading an input of search key, we perform a linear search on 
        //data with this search key. Finaaly print out the result of the linear
        //search
        //to-complete
         int index = linearSearch(array, searchKey);
         formatter(searchKey, index);
     }
/* =============================================================================
                           HELPER METHODS 
   =============================================================================
 */
/**
 * To perform a linear search on an array of data
 *
 * @param data a static array of integers
 * @param searchKey the search key of performing the search
 * @return -1 if the searchKey is not found in the data, otherwise the position
 * of the searchKey in the data
 */
 private static int linearSearch(int[] data, int searchKey)
 {   for (int i =0; i< data.length; i++){
     if(data[i]==searchKey)
         return i;
 }
 return -1;
 }

 private static void formatter(int searchkey, int index){
        if (index != -1){
            System.out.println(searchkey + " was found of position " + index);
        }
        else{
            System.out.println(searchkey + " was not found");
        }
    }
/* ============================================================================
                            CLASS VARIABLES
   ============================================================================
 */
     //the maximum size of the static array
     private static final int MAX_SIZE = 20;
}

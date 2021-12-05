import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class performs a binary search on an array of 20 random integers in the 
 * range 1 to 100 to discover whether or not it contains an integer input from
 * the keyboard.
 *
 * @author Jing Hua Ye
 * @date Nov/6/2021
 * @version 1.0
 */
 class BinarySearchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int[] array = new int[MAX_SIZE];
        for (int i = 0; i < array.length; i++)
            array[i] = generator.nextInt(100) + 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Please enter an integer value ( -1 to close the program): ");
        int searchKey = input.nextInt();
        if (searchKey == -1) {
            System.out.println("You choose to exit");
            System.exit(0);
        }
       int index = binarySearch(array, searchKey);
       formatter(searchKey, index);
    }

/* =============================================================================
                           HELPER METHODS 
   =============================================================================
 */

    /**
     * To perform a binary search on an array of data
     *
     * @param data      a static array of integers
     * @param searchKey the search key of performing the search
     * @return -1 if the searchKey is not found in the data, otherwise the position
     * of the searchKey in the data
     */
    private static int binarySearch(int[] data, int searchKey) {
        int leftEnd = 0, rightEnd = data.length - 1;
        while (leftEnd <= rightEnd) {
            int m = leftEnd + (rightEnd - leftEnd) / 2;
            // Check if searchKey is present at mid
            if (data[m] == searchKey)
                return m;
            // If searchKey greater, ignore left half
            if (data[m] < searchKey)
                leftEnd = m + 1;
            // If searchKey is smaller, ignore right half
            else
                rightEnd = m - 1;
        }
        // if we reach here, then searchKey was not present
        return -1;
    }

    //you may need to consider to define some other helper methods to format the final outputs
private static void formatter(int searchkey, int index){
        if (index != -1){
            System.out.println(searchkey + " was found in position " + index);
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

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

        //Task: create an array of 20 random integers between 1 to 100 
        //to-complete

        //Task: which method should be used in Arrays class to make sure data in a sorted 
        //order
        //to-complete
                
        //Task: display array as below: for example [-1, 10, 40, 30]
        //Hint: use the Arrays class, which method should we use to output data in a such 
        //format?
        //to-complete
        
        //Task: repeatedly input an integer from user: -1 terminates the program
        //after reading an input of search key, we perform a binary search on 
        //data with this search key. Finaaly print out the result of the binary search as the
        //sample outputs provided in the task specification
        //to-complete
     }
/* =============================================================================
                           HELPER METHODS 
   =============================================================================
 */
/**
 * To perform a binary search on an array of data
 *
 * @param data a static array of integers
 * @param searchKey the search key of performing the search
 * @return -1 if the searchKey is not found in the data, otherwise the position 
 * of the searchKey in the data
 */
 private static int binarySearch(int[] data, int searchKey)
 {   //to-complete
 }
  
  //you may need to consider to define some other helper methods to format the final outputs

/* ============================================================================
                            CLASS VARIABLES
   ============================================================================
 */
     //the maximum size of the static array
     private static final int MAX_SIZE = 20; 
}

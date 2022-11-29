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
        int[] arrayInt = new int[MAX_SIZE];
        for (int i = 0; i<arrayInt.length; i++){
          arrayInt[i] = generator.nextInt(100)+1;
        }

        //Task: which method should be used in Arrays class to make sure data in a sorted 
        //order
        //to-complete
        Arrays.sort(arrayInt);
        isSorted(arrayInt);

        //Task: display array as below: for example [-1, 10, 40, 30]
        //Hint: use the Arrays class, which method should we use to output data in a such 
        //format?
        //to-complete
        System.out.println(Arrays.toString(arrayInt));
        
        //Task: repeatedly input an integer from user: -1 terminates the program
        //after reading an input of search key, we perform a binary search on 
        //data with this search key. Finaaly print out the result of the binary search as the
        //sample outputs provided in the task specification
        //to-complete
        int integer = 0;
        System.out.print("Please enter an integer value (-1 to quit): ");
        integer = input.nextInt();
        while (integer != -1){
          int position = binarySearch(arrayInt, integer);
          if (position != -1){
            System.out.println(integer+" was found in position "+position);
          } else {
            System.out.println(integer+" was not found");
          }
          System.out.print("Please enter an integer value (-1 to quit): ");
          integer = input.nextInt();
        }
        input.close();
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
  int left = 0, right = data.length - 1;

  while (left <= right) {
      int mid = left + (right - left) / 2;

      for (int i = left; i<right; i++){
        if (i == mid){
          System.out.print(data[i]+"* ");
        } else {
          System.out.print(data[i]+ " ");
        }
      }
      System.out.print("\n");

      if (data[mid] == searchKey){
        return mid;
      }
      if (data[mid] < searchKey){
        left = mid + 1;
      } else {
        right = mid - 1;
      }
  }
  return -1;
 }
  
  //you may need to consider to define some other helper methods to format the final outputs
  private static void isSorted(int[] arrayInt){
    boolean isSorted = true;
    for (int i = 0; i<arrayInt.length-2; i++){
      if (arrayInt[i] > arrayInt[i+1]){
        System.out.println("This array is not sorted.");
        isSorted = false;
        break;
      }
    }
    if (isSorted){
      System.out.println("This array is sorted.");
    }
  }

/* ============================================================================
                            CLASS VARIABLES
   ============================================================================
 */
     //the maximum size of the static array
     private static final int MAX_SIZE = 20; 
}

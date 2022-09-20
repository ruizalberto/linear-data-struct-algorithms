import java.util.Scanner; //Program uses class Scanner

public class ReadingInputsScanner {
  public static void main(String[] args) {

    //create a Scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: "); //prompt
    String txt = input.nextLine(); //read a string from user

    System.out.print("Enter an integer: "); 
    int num = input.nextInt(); //read an integer from user

    System.out.print("Enter a floating-point number: ");
    double num2 = input.nextDouble(); //read a floating-point number from user

    //soln1
    //String blankline = input.nextLine();

    System.out.print("Enter another string: ");
    //Problematic: Read a string after nextDouble
   // String txt2 = input.nextLine(); 
   //soln2
    String txt2 = input.next();
    System.out.printf("You have entered:- " + num + " " + "and name as " + txt2);
  }
}
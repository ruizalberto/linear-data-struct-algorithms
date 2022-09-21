import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
   //Read data using readLine
   System.out.print("Enter a number: ");
   String name = reader.readLine();
   
   int num = Integer.parseInt(name);
   System.out.println(name);
   System.out.println("num: " + num);
  }
}
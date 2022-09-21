import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        int[] flightSeats = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Please Type 1 for First Class and Please Type 2 for Economy: ");
        int seatClass = input.nextInt();
        int seatAssigned = 0;
        int upperBound = 5;
        Random rand = new Random();
        if (seatClass == 1){
            seatAssigned = rand.nextInt(upperBound)+1;
        } else if (seatClass == 2){
            seatAssigned = rand.nextInt(upperBound)+6;
        }
        flightSeats[seatAssigned] = seatAssigned;
        System.out.println("Your boarding pass is " + seatAssigned);
        if (seatAssigned>5){System.out.println("Economy section of the plane");} 
        else {System.out.println("First Class section of the plane");}
        
        input.close();
    }
}
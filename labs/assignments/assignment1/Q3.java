import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[] flightSeats = new int[10];
        Scanner input = new Scanner(System.in);
        boolean notChangedSeat = true;

        int i = 0;
        while (i<flightSeats.length){
            System.out.print("Please Type 1 for First Class and Please Type 2 for Economy: ");
            int seatClass = input.nextInt();
            int seatAssigned = 0;
            if (seatClass == 1){
                while (flightSeats[seatAssigned] != 0){
                    seatAssigned++;
                    if (seatAssigned==5){
                        System.out.println("First Class section is full. You are going to be placed in Economic section.");
                    }
                }
            } else if (seatClass == 2){
                seatAssigned += 5;
                while (flightSeats[seatAssigned] != 0){
                    seatAssigned++;
                    if (seatAssigned==10){
                        System.out.println("Economic section is full.");
                        System.out.print("Is it acceptable if we placed you in the First Class section? [yes/no] ");
                        String reply = input.next();
                        if (reply.equals("yes")){
                            notChangedSeat = true;
                            seatAssigned = 0;
                            while (flightSeats[seatAssigned] != 0){
                                seatAssigned++;
                            }
                        } else {
                            notChangedSeat = false;
                            System.out.println("Next flight leaves in 3 hours.");
                            break;
                        }
                    }
                }
            }
            if (notChangedSeat){
                i++;
                flightSeats[seatAssigned] = seatAssigned+1;
                System.out.println("Your boarding pass is " + flightSeats[seatAssigned]);
                if (seatAssigned+1>5){
                    System.out.println("Economy section of the plane");
                } else {
                    System.out.println("First Class section of the plane");
                }
            }
        }
        input.close();
    }
}
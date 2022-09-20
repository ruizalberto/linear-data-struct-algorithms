import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int power = findingDigitLength(number);
        printSolution(power, number);

        input.close();
    }

    private static int findingDigitLength(int number){
        int power = 1;
        while (power <= number){
            power*=10;
        }
        power /= 10;
        return power;
    }

    private static void printSolution(int power, int number){
        while (power > 0) {
            int solution = number/power;
            System.out.printf("%-4d",solution);
            number %= power;
            power /= 10;
        }
        System.out.println();
    }
}

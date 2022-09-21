import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int numbers[] = enteringNumbers();
        printingAsterisks(numbers);
    }

    private static int[] enteringNumbers() {
        Scanner input = new Scanner (System.in);
        
        int[] number = {0, 0, 0, 0, 0};
        int i = 0;
        while (i<5){
            while (number[i] < 1 || number[i] > 30){
                System.out.printf("Enter a number: ");
                number[i] = input.nextInt();
            }
            i++;
        }
        input.close();
        return number;
    }

    private static void printingAsterisks(int[] number) {
        String asterik = "*";
        for (int j = 0; j < number.length; j++)
        {
            System.out.println(asterik.repeat(number[j])); 
        }
    }
}

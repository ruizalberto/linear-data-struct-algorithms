import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] number = new int[5];
        int i = 0;
        do {
            System.out.printf("Enter a number: ");
            number[i] = input.nextInt();
            i++;
        } while (number[i] > 0 && number[i] < 30);
        
    
        for (int j = 0; j < number[j]; j++)
        {
            String asterik = "*";
            System.out.println(asterik.repeat(number[j])); 
        }
                    
        System.out.println();
        input.close();
    }
}

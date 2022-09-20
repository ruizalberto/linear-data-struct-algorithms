import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
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
    
        for (int j = 0; j < number.length; j++)
        {
            String asterik = "*";
            System.out.println(asterik.repeat(number[j])); 
        }
                    
        input.close();
    }
}

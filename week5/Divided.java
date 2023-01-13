package week5;
import java.util.Scanner;
public class Divided {
    public static int divided (int number) {
        int i = 1;
        while (i <= number) {
            if (number % i == 0 && i != number) {
                System.out.print(i + " ");
            }
            i++;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(divided(number));
    }
}

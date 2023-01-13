package week5;
import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a number2: ");
        int number2 = scanner.nextInt();
        int y = 0;
        while (number2 >= number) {
            y = y + number;
            number++;
        }
        scanner.close();
        System.out.println("The sum is " + y);
    }
}

package week5;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int y = 0;
        for (int i = 0; i <= number; i++) {
            y = y + i;
        }
        scanner.close();
        System.out.println("The sum is " + y);
    }
}

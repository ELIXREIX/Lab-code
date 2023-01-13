package week5;
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int i = 2;
        while (i <= num) {
            int j = 2;
            boolean isPrime = true;
            while (j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        scanner.close();
        }
    }
}

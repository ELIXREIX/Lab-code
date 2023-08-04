package Term2.week1term2;
import java.util.Scanner;
public class IntDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your A: ");
        double A = sc.nextDouble();
        System.out.print("Enter your B: ");
        double B = sc.nextDouble();
        if (A >= B ) {
          System.out.println((A)+ " " +(B));
        }
        else {
             System.out.println((B)+ " " +(A));
        }
        sc.close();
    }
}

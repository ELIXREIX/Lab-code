
import java.util.Scanner;
public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kms:");
        double fare = 0;
        double distance = sc.nextDouble();
        if (0<= distance && distance <= 1) {
            fare = 35;
        } else if (1<= distance && distance <= 12) {
            fare = (5*distance) + 30;
        } else if (12<= distance && distance <= 20) {
            fare = (5.5*distance) + 24;
        } else if (20<= distance && distance <= 40) {
            fare = (6*distance) + 14;
        } else if (40<= distance && distance <= 60) {
            fare = (6.5*distance) - 6;
        } else if (60<= distance && distance <= 80) {
            fare = (7.5*distance) - 66;
        } else {
            fare = (8.5*distance) - 146;
        }
        System.out.println("The fare is: " + fare);
        sc.close();
        //6552300158
    }
}

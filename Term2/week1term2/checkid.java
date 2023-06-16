
import java.util.Scanner;

public class checkid {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String ID = sc.nextLine();
        double lon = ID.length();
        sc.close();
        if (lon == 10) {
        System.out.println("รหัสนักศึกษาถูกต้อง ");
        } else {
        System.out.println("รหัสนักศึกษาไม่ถูกต้อง ");
        }
}
}
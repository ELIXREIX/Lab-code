import java.util.Scanner; 
public class TempC2F {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Temperature in C: ");
    double C = scanner.nextDouble();
    double F = C * 9/5 + 32 ;
    System.out.println("F is: " + F);
    scanner.close();
  }
}
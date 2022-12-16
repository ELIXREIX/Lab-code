import java.util.Scanner; 
public class TempF2C {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Temperature in F: ");
    double F = scanner.nextDouble();
    double Cel = (F - 32) * 5/9;
    System.out.println("C is: " + Cel);
  }
}
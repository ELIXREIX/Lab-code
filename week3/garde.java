package week3;
import java.util.Scanner;
public class garde {
    public static String gradeCalculate(double num) {
        String[] rank = {"A", "B+", "B", "C+", "C", "D+", "D", "F"};
        int step = 5;
        int startpoint = 90;
        int j = 0;
        while (startpoint > 0) {
          if (num >= startpoint) {
            return rank[j];
          } else if (startpoint < 60) {
            return rank[j];
          }
          startpoint -= step;
          j += 1;
        }
        return null;
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("The student's letter grade is " + gradeCalculate(num));
    }
}

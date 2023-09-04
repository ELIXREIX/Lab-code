package week5;
import java.util.Scanner;
public class Wage {
    public static Integer salary(int hours){
        double wage = 100;
        double income = 0;
        if (hours <= 40) {
            income = wage * hours;
        } else {
            income = (wage * 40) + (wage * 1.5 * (hours - 40));
        }
        return (int) income;
    }
       
        
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter hours: ");
    int hours = scanner.nextInt();
    scanner.close();
    System.out.println(salary(hours));
    }
}

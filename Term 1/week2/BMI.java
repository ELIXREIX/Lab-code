import java.util.Scanner; 
public class BMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your weight in kilograms: ");
    double weight = scanner.nextDouble();
    System.out.print("Enter your height in centimeters: ");
    double height = scanner.nextDouble();
    double heightmeters = height / 100.0;
    double bmi = weight / (Math.pow(heightmeters,2) );
    scanner.close();
    System.out.println("Your BMI is: " + bmi);
    if (bmi < 18.5) {
        System.out.println("Underweight");
    }
    else if (bmi < 25) {
        System.out.println("Normal");
    }
    else if (bmi < 30) {
       System.out.println("Overweight");
    }
    else {
        System.out.println("Obese");
    }
  }
} 

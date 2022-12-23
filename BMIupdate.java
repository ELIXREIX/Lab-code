import java.util.Scanner; 
public class BMIupdate {
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
    else if (18.5 < bmi && bmi < 22.9) {
        System.out.println("Normal");
    }
    else if (23 < bmi && bmi < 24.9) {
       System.out.println("Overweight");
    } 
    else if (25 < bmi && bmi < 29.9) {
       System.out.println("Obese");
}
    else {
        System.out.println("Indanger of death");
    }
  }
} 

package P1.Term2.week2term2.Homework2;

public class Calculation {
    public static int length(String firstString, String secondString) {
    int length = firstString.length() + secondString.length();
    return length;
}

public static double toCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5 / 9;
    return celsius;
}

public static double toFahrenheit(double celsius) {
    double fahrenheit = (celsius * 9 / 5) + 32;
    return fahrenheit;
}

public static double average(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    double average = (double) sum / numbers.length;
    return average;
}
public static void main(String[] args) {
    int[] numbers = {11, 23, 47, 98};

    double averageResult = average(numbers);

    System.out.println("Average: " + averageResult);
}

}

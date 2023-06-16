package oopweek1;

public class looparraysum {
    public static void main(String[] args) {

        int[] numbers = {111, 222, 333, 444, 555};

        int sum = 0; // Initialize sum variable

        // Loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of numbers: " + sum);
    }
}



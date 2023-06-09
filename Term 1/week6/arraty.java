package week6;

import java.util.Arrays;

public class arraty {
    public static void main(String[] args) {
        int score[] = {36, 28, 24, 30, 50, 34, 38, 88, 48, 40};
        System.out.println("The original array is: ");
        for (int num : score) {
            System.out.print(num + " ");
        }
        Arrays.sort(score);
        System.out.println("\nThe sorted array is: ");
        for (int num : score) {
            System.out.print(num + " ");
        }
    }
}
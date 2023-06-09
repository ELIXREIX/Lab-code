package week6;

public class tester {
    public static void main(String[] args) {
        double score[] = {20,18.57,25.71,25.71,30,25.71,28.57,27.14,25.00,28.57,27.14};
        double sum = 0;
        int n = score.length;

        for (int i = 0; i < n; i++) {
        sum += score[i];
        }
        double average = sum / n;
        System.out.println("The average score is: " + average);
        double max = score[0];
        double min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("The maximum score is: " + max);
        System.out.println("The minimum score is: " + min);
        for (int i = 0; i < n; i++) {
            if (score[i] > average) {
                System.out.println("The score over average is: " + score[i]);
            }
        }
    }
}

package week6;

public class newsum {
    public static void main(String[] args) {
        int score[] = {-3, 6, -8, 9, -11, 12, -2};
        int sum = 0;
        for (int i = 0 ; i < score.length ; i++) 
            sum = sum + score[i]; 
        System.out.println(sum);
    }
}

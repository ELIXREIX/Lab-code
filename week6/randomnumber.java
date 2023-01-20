package week6;
import java.util.Random;
public class randomnumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt(101);  
        System.out.println(a);
        System.out.println(b); 
    }
}

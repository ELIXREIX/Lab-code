package P1.Term2.week1term2.Term2.week1term2;


public class getstarted {
    public static void main(String[] args) {
        System.out.println("sum from 1 to 10 is = " + sum(1 , 10));
        }
    public static int sum (int i1 , int i2){
        int sum = 0;
        for (int i = i1 ; i <= i2 ; i++) {
            sum += 1 ;
        }
        return sum ;
    }
 }
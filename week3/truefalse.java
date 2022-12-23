package week3;

public class truefalse {
    public static void main(String[] args) {
    int x = 1 ;
    int y = 5 ;
    boolean z = true;
    boolean result1 = (x > y)||(y == x) ;
    boolean result2 = !(x==y) && z ;
    boolean result3 = !z&&z||!z ;
    boolean result4 = (x!=y)&&(x>-y) ;
    boolean result5 = x+y >= x&&z ;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    }
}
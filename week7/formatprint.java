package week7;

public class formatprint {
    public static void main(String[] args) {
        int i = 3277;
        double d = 132324.2555555 ;

        System.out.printf("%.2f%n", d);
        System.out.printf("%06d%n", i);
        System.out.printf("%,d%n", i);
        System.out.printf("%,.6f%n", d);
        System.out.printf("%,6d%n", i);
        System.out.printf("%d.00%n", i);
        System.out.printf("%+,d%n", i);
        System.out.printf("%+,.3f%n", d);

        String s = "win";
        int b = 19 ;
        double cc = 53.33333333 ;
        System.out.printf("Hello my name is %s and i'm %d and %.2f kgs%n", s, b, cc);
    }
}

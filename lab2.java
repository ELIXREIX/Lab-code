
public class lab2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = -4;
        double root1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double root2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        System.out.println("x 1 " + root1);
        System.out.println("x 2: " + root2);
  }
}


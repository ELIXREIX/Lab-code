package P1.Term2.LAB8;

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle(3);
        System.out.println(a);
        ResizeableCircle R = new ResizeableCircle(100);
        R.resize(70);
        System.out.println(R);
    }
}

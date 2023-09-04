package Term2.TEST;

public class Monumenttest {
    public static void main(String[] args) {
        Monumenta a = new Monument("Mulla", 1500, "Moon");
        System.out.println(a);

        AgeofMonument b = new AgeofMonument("Mulla", 1500, "Moon"); // Provide valid values here
        b.now(2023); //int
        System.out.println(b);
    }
}

package P1.Term2.TEST;

public class AgeofMonument extends Monument implements Now {

    private int age;

    public AgeofMonument(String name, int yearBuilt, String location) {
        super(name, yearBuilt, location); // Call the superclass constructor
    }

    @Override
    public void now(int years) {
        age = Math.abs(super.getYearBuilt() - years);
    }
    public String toString() {
        return String.format("%s[Name:%s, YearBuilt:%d, Location:%s , Age:%s]",
        Classname(), name, yearBuilt, location, age);
}
}
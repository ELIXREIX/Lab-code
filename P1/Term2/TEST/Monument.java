package P1.Term2.TEST;

// Define a class named Monument that inherits from the Monumenta class
public class Monument extends Monumenta {

    // Constructor to initialize the Monument object with name, yearBuilt, and location
    public Monument(String name, int yearBuilt, String location) {
        // Call the constructor of the superclass Monumenta with provided attributes
        super(name, yearBuilt, location);
    }

    // Overloaded constructor for the Monument object with name and yearBuilt only
    public Monument(String name, int yearBuilt) {
        // Call the constructor of the superclass Monumenta with provided attributes,
        // setting the location as an empty string
        super(name, yearBuilt, "");
    }
}

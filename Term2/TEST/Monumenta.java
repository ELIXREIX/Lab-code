package Term2.TEST;

// Define an abstract class named Monumenta which implements the MonumentInterface
abstract class Monumenta implements MonumentInterface {

    // Declare protected attributes for name, location, and yearBuilt
    protected String name;
    protected String location;
    protected int yearBuilt;

    // Constructor to initialize the attributes when a Monumenta object is created
    public Monumenta(String name, int yearBuilt, String location) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.location = location;
    }

    // Getter and setter methods for the name attribute
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for the location attribute
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and setter methods for the yearBuilt attribute
    public int getYearBuilt() {
        return yearBuilt;
    }
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Override the toString method to provide a formatted string representation of the object
    @Override
    public String toString() {
    // Using String.format to create a formatted string with placeholders for attributes
    // %s is for string, %d is for integer
    // The placeholders are replaced by actual values provided in the argument list
    return String.format("%s[attribute1:%s, attribute2:%d, attribute3:%s]",
                         Classname(), name, yearBuilt, location);
}
    // Override the Classname method to return the simple class name of the object
    @Override
    public String Classname() {
        return this.getClass().getSimpleName();
    }
}
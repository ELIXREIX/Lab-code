package Term2.week5term2;

public class Person {
    private String name;
    private String address;
    
     public Person(String Name , String Address){
         System.out.println("Invoke Person(String name, String address)");
         name = Name;
         address =Address;
}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
    
        return String.format("Person[name=%s address=%s]", name, address);
}
}
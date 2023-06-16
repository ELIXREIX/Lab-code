package Term2.week2term2;

class dogstat {
    int size;
    String breed; // พันธุ์
    String name;
    String color;
    void bark(){
        System.out.println("bok bok");
    }
}

public class dog {
    public static void main(String[] args) {
        dogstat a = new dogstat();    
        a.breed = "bulldog";
        a.name = "XIXI";
        a.color = "black";
        a.bark();

    }
    

}


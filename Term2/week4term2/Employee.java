package Term2.week4term2;


public class Employee {
    private String Firstname;
    private String lastname;
    private Date dateb;
    private Date datehire;

    public Employee (String first,String last,Date datebir,Date datehir ) {
        Firstname = first ;
        lastname = last ;
        dateb = datebir;
        datehire = datehir;
        System.out.println(this);

    }
    public String toString () {
        return String.format("%s %s Hired: %s Birthday: %s ",Firstname,lastname,dateb,datehire, null);
    }
}

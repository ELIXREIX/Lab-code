package Term2.week1term2;


public class Encap {
    public static void main(String[] args) {
        
        Employee a = new Employee();
        a.id = 552300158 ;
        a.name = "Suphachote" ;
        //a.salary = 10_000_000;
        a.setSalary(1000000);
        System.out.println(a.getsalary());

    }
}
//เป็นการสร้าง class  เพื่อนำมาใช้งาน
class Employee {
    public int id;
    public String name;
    private double salary;

    public void setSalary (int salary){
        this.salary = salary;
    }

    public double getsalary () {
        return salary ;
}
}
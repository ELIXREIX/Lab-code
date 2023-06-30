package Term2.week4term2;

public class Employeetest {
    public static void main(String[] args) {
        Date birthdate = new Date(6,8,2002);
        System.out.println(birthdate);
        Date hire = new Date(30, 6, 2023);
        System.out.println(hire);
        Employee win = new Employee("Suphacht", "Baochalee", birthdate, hire);
        System.out.println(win);
    }
    
}

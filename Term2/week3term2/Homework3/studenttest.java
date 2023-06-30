package Term2.week3term2.Homework3;

public class studenttest {
    public static void main(String[] args) {
        student t1 = new student();
        t1.setName("tester");
        t1.setAge(16);
        t1.setGrade('A');
        t1.getinfo();
        student t2 = new student();
        t2.setName("tester fail age");
        t2.setAge(19);
        t2.setGrade('B');
        t2.getinfo();
        student t3 = new student();
        t3.setName("tester fail grade");
        t3.setAge(12);
        t3.setGrade('H');
        t3.getinfo();
        student t4 = new student();
        t4.setName("");
        t4.setAge(17);
        t4.setGrade('A');
        t4.getinfo();
        student t5 = new student();
        t5.setName("");
        t5.setAge(4);
        t5.setGrade('J');
        t5.getinfo();
         
    }
}

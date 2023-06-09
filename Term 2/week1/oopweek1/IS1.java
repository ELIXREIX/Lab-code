package oopweek1;

public class IS1 {
    public static void main(String[] args) {
        students a = new students("0158");
        a.getstudentID();
        a.setName("water");
        a.setMajor("CAI");
        a.sayhello();
        students b = new students("0162");
        b.getstudentID();
        b.setName("jack");
        b.setMajor("DIT");
        b.sayhello();
        students c = new students("0175");
        c.getstudentID();
        c.setName("Tommy");
        c.setMajor("RAE");
        c.sayhello();
    }
}

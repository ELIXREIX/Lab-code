package Term2.week5term2;

public class TestRun {
    public static void main (String [] args) {

    System.out.println ("========================== Person ============================");

    //Persontest
    Person ct = new Person("Naraka eiei", "88/8 PIM Monthaburi");
    System.out.println(ct);

    System.out.println ("========================== Staff ============================");

    Staff ck = new Staff("Chanakarn Kingkaew","85/1 PIM Nonthaburi","PIM",1000000);
    System.out.println(ck);

    System.out.println ("========================== Student ============================");

    Student cv = new Student("Kim Taeyeon","85/1 PIM Nonthaburi","CAI",2558,50000);
    System.out.println(cv);

    //-    ทำการสร้าง Student, Person, Staff เพิ่มอีก 3 คน 
    //Person
    System.out.println ("========================== Person ============================");

    Person si = new Person("Si", "PIM Monthaburi");
    System.out.println(si);

    System.out.println ("========================== Staff ============================");

    Staff ra = new Staff("ra", "PIM Monthaburi", "PIM", 1_999);
    System.out.println(ra);

    System.out.println ("========================== Student ============================");

    Student ka = new Student("ka","PIM Monthaburi" , "CAI", 2566, 48000);
    System.out.println(ka);


    }

}

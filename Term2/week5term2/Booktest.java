package Term2.week5term2;

public class Booktest {
    public static void main(String[] args) {
        Author Winter = new Author("Suphachote Baochalee", "gofafafa1@gmail.com",'M');
        System.out.println(Winter);
        Book dabook = new Book ("My name is nick", Winter, 99);
        System.out.println(dabook);
        Book booknum1= new Book("WHAT HAPPENED TO YOU", new Author("BRUCE D. PERRY ", "-", 'm'), 355.00);
        System.out.println(booknum1);
        Book booknum2= new Book("LOVE ME LOVE MY JOB", new Author("อานนทวงศ์ มฤคพิทักษ์", "-", 'm'), 207.00);
        System.out.println(booknum2);
        Book booknum3= new Book("DEEP WORK", new Author("CAL NEWPORT", "-", 'f'), 243.00);
        System.out.println(booknum3);
      

    }
    
}
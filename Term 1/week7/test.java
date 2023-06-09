package week7;

public class test {

    public static void main(String[] args) {
        String y= "Hello".concat("World"); 
        System.out.println(y);
        String a = "Java is very Easy".substring(3,9); 
        System.out.println(a);
        boolean z = Character.isLetter('3'); 
        System.out.println(z);
        boolean g = "Master".contains("er"); 
        System.out.println(g);
        boolean d = Character.isDigit('3'); 
        System.out.println(d);
        char o = Character.toUpperCase('c'); 
        System.out.println(o);
        boolean  j = "Bangkok".equalsIgnoreCase("bamgkok"); 
        System.out.println(j);
        int p = "Bangkok".compareTo("bangkok") ;
        System.out.println(p);
        boolean b = "Bangkok".startsWith("Bang");
        System.out.println(b);
        boolean ok = "Programming is easy!".contains(""); 
        System.out.println(ok);
        String  e = "Java is very Easy".substring(6); 
        System.out.println(e);
        String    t = "Hi" + " World! "; 
        System.out.println(t);
        System.out.println("\"Chanakarn//Kingkaew\"");
        char [ ] exp = {'H', 'e', 'l', 'l', 'o' , ' ', '!'};
        String  f = new String(exp);
        System.out.println(f);
        String ac = "33"; 
        String bd = "3.14" ;
        int hx = Integer.parseInt(ac);
        double  hc = Double.parseDouble(bd);
        System.out.println(hx+hc);
    }
}

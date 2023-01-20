package week6;

public class ArrayCopyDemo { 
        public static void main(String[] args) { 
    
            char[] copyFrom = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' };
            char[] copyTo = new char[4]; 
    System.arraycopy(copyFrom, 2, copyTo, 0, 4); 
    System.out.println(new String(copyTo)); 
    
        } 
    
    } 
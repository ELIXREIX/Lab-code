package week5;

public class Fibonacci { 

  public static void main (String [] args) { 
    int i =1; 
    int j = 1; 
    for (int k = 0; k < 30;) {
      System.out.println(i); 
      System.out.println(j);
      k = i  + j; 
      System.out.println(k); 
      i = j; 
      j = k;  
} 
} 
}




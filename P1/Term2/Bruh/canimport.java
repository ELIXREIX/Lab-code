package P1.Term2.Bruh;

import java.io.*; 

import java.util.Scanner; 

 

public class canimport { 

    public static void main(String[] args) throws IOException { 

 

        Scanner s = null; 

 

        try { 

            s = new Scanner(new BufferedReader(new FileReader("Bruh/xanadu.txt"))); 

 

            while (s.hasNext()) { 

                System.out.println(s.next()); 

            } 

        } finally { 

            if (s != null) { 

                s.close(); 

            } 

        } 

    } 

} 

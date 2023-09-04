package P1.Term2.Bruh;

import java.io.FileInputStream; 

import java.io.FileOutputStream; 

import java.io.IOException; 

public class New { 

    public static void main(String[] args) throws IOException { 

        FileInputStream in = null; 

        FileOutputStream out = null; 

        try { 

            in = new FileInputStream("Bruh/xanadu.txt"); 

            out = new FileOutputStream("Bruh/outagain.txt"); 

            int c; 

            while ((c = in.read()) != -1) { 

                out.write(c); 

                System.out.println("" + c + " to char = " + (char) c); 

            } 

        } finally { 

            if (in != null) { 

                in.close(); 

            } 

            if (out != null) { 

                out.close(); 

            } 

        } 

    } 

} 

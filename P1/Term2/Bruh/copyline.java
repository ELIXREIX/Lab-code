package P1.Term2.Bruh;

import java.io.FileReader; 

import java.io.FileWriter; 

import java.io.BufferedReader; 

import java.io.PrintWriter; 

import java.io.IOException; 

 

public class copyline { 

    public static void main(String[] args) throws IOException { 

 

        BufferedReader inputStream = null; 

        PrintWriter outputStream = null; 

 

        try { 

            inputStream = new BufferedReader(new FileReader("Bruh/xanadu.txt")); 

            outputStream = new PrintWriter(new FileWriter("Bruh/haracteroutput.txt")); 

 

            String l; 

            while ((l = inputStream.readLine()) != null) { 

                outputStream.println(l); 

                System.out.println(""+l); 

            } 

        } finally { 

            if (inputStream != null) { 

                inputStream.close(); 

            } 

            if (outputStream != null) { 

                outputStream.close(); 

            } 

        } 

    } 

} 
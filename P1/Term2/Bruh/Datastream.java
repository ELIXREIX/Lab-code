package P1.Term2.Bruh;

import java.io.BufferedInputStream; 

import java.io.BufferedOutputStream; 

import java.io.DataInputStream; 

import java.io.DataOutputStream; 

import java.io.EOFException; 

import java.io.FileInputStream; 

import java.io.FileNotFoundException; 

import java.io.FileOutputStream; 

import java.io.IOException; 

public class Datastream { 
    public static void main(String[] args) throws FileNotFoundException, IOException { 

        final String dataFile = "Bruh/invoicedata.txt"; 

        final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99}; 

        final int[] units = {12, 8, 13, 29, 50}; 

        final String[] descs = { 

            "Java T-shirt", 

            "Java Mug", 

            "Duke Juggling Dolls", 

            "Java Pin", 

            "Java Key Chain" 

        }; 

        DataOutputStream out; 

        DataInputStream in; 

        out = new DataOutputStream(new BufferedOutputStream( 

                new FileOutputStream(dataFile))); 

        for (int i = 0; i < prices.length; i++) { 

            out.writeDouble(prices[i]);  

            out.writeInt(units[i]);  

            out.writeUTF(descs[i]);  
 
        }   

        out.close(); 

        in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile))); 

        double price; 

        int unit; 

        String desc; 

        double total = 0.0; 

        try { 

            while (true) { 
                
                price = in.readDouble(); 

                unit = in.readInt(); 

                desc = in.readUTF(); 

                System.out.format("You ordered %d" + " units of %s at $%.2f%n", 

                        unit, desc, price); 

                total += unit * price; 

            } 

        } catch (EOFException e) { 

        } 

        in.close(); 

    } 

} 
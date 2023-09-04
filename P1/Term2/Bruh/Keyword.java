package P1.Term2.Bruh;

 

import java.io.FileOutputStream; 

import java.io.IOException; 

import java.io.ObjectOutputStream; 

import java.io.Serializable; 

public class Keyword implements Serializable { 

 

    public String name; 

    public String address; 

    public transient int SSN; 

    public int number; 

 

    public void mailCheck() { 

        System.out.println("Mailing a check to " + name + " " + address); 

    } 

 

} 

class SerializeDemo 

{ 

   public static void main(String [] args) 

   { 

      Keyword e = new Keyword(); 

      e.name = "Reyan Ali"; 

      e.address = "Phokka Kuan, Ambehta Peer"; 

      e.SSN = 11122333; 

      e.number = 101; 

       

      try 

      { 

         FileOutputStream fileOut = 

         new FileOutputStream("Bruh/employee.ser"); 

         ObjectOutputStream out = new ObjectOutputStream(fileOut); 

         out.writeObject(e); 

         out.close(); 

         fileOut.close(); 

         System.out.printf("Bruh/Serialized data is saved in employee.ser"); 

      }catch(IOException i) 

      { 

          i.printStackTrace(); 

      } 

   } 

} 
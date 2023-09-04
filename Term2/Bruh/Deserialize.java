package Term2.Bruh;

import java.io.*; 

public class Deserialize 

{ public String name; 

    public String address; 

    public transient int SSN; 

    public int number; 
   

   public static void main(String [] args) 

   { 

      
      Keyword e = null; 

      try 

      { 

         FileInputStream fileIn = new FileInputStream("Bruh/employee.ser"); 

         ObjectInputStream in = new ObjectInputStream(fileIn); 

         e = (Keyword) in.readObject(); 

         in.close(); 

         fileIn.close(); 

      }catch(IOException i) 

      { 

         i.printStackTrace(); 

         return; 

      }catch(ClassNotFoundException c) 

      { 

         System.out.println("Employee class not found"); 

         c.printStackTrace(); 

         return; 

      } 
      

      System.out.println("Deserialized Employee..."); 

      System.out.println("Name: " + e.name); 

      System.out.println("Address: " + e.address); 

      System.out.println("SSN: " + e.SSN); 

      System.out.println("Number: " + e.number); 

    } 

} 
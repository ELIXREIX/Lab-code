package P1.Term2.Bruh;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class WriteStudent {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1, student2 = null;

        FileInputStream fileIn = new FileInputStream("Bruh/student1");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        student1 = (Student) in.readObject();
        in.close(); // Closing FileInputStream after reading student1

        fileIn = new FileInputStream("Bruh/student2"); 
        in = new ObjectInputStream(fileIn);
        student2 = (Student) in.readObject();
        in.close(); // Closing FileInputStream after reading student2

        PrintWriter outputStream = new PrintWriter(new FileWriter("Bruh/Student.csv"));
        outputStream.println(student1.getName() + "," + student1.getSurname() + "," + student1.getId() + "," + student1.getMajor() + "," + student1.getGPA());
        outputStream.println(student2.getName() + "," + student2.getSurname() + "," + student2.getId() + "," + student2.getMajor() + "," + student2.getGPA());
        outputStream.close();
    }
}

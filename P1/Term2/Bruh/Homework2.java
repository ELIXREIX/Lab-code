package P1.Term2.Bruh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework2 {
    public static void main(String[] args) {
        String[] inputFiles = {"Term2/Bruh/Sheet/file1.csv", "Term2/Bruh/Sheet/file2.csv"};
        String[] outputFiles = {"Term2/Bruh/Sheet/output1.txt", "Term2/Bruh/Sheet/output2.txt"};
        
        for (int i = 0; i < inputFiles.length; i++) {
            int sum = readAndSumFile(inputFiles[i]);
            writeToFile(outputFiles[i], sum);
            System.out.println("Sum of " + inputFiles[i] + ": " + sum);
        }
    }
        
    public static int readAndSumFile(String filename) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    value = value.trim(); 
                    try {
                        sum += Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
    public static void writeToFile(String outputFilename, int sum) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
            writer.write(Integer.toString(sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

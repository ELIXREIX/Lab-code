package P1.Term2.Bruh;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Homework {

    public static void main(String[] args) throws IOException {
        int startFileIndex = 1;
        int endFileIndex = findHighestIndex(); // Automatically determine the end index

        for (int i = startFileIndex; i <= endFileIndex; i++) {
            String inputFilePath = "Term2/Bruh/Sheet/file" + i + ".csv";
            processCSVFile(inputFilePath);
        }
    }


    public static int findHighestIndex() {
        File folder = new File("Term2/Bruh/Sheet");
        File[] files = folder.listFiles();

        int highestIndex = 0;
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                if (name.startsWith("file") && name.endsWith(".csv")) {
                    try {
                        int index = Integer.parseInt(name.substring(4, name.length() - 4));
                        highestIndex = Math.max(highestIndex, index);
                    } catch (NumberFormatException ignored) {
                        // Ignore files that don't match the naming pattern
                    }
                }
            }
        }

        return highestIndex;
    }


    public static void processCSVFile(String inputFilePath) throws IOException {

        // Read all lines from the CSV file
        List<String> lines = Files.readAllLines(Paths.get(inputFilePath));

        // Create a list to store the numbers in the input file
        List<Integer> numbers = new ArrayList<>();

        // Process each line
        for (String line : lines) {
            String[] values = line.split(",");
            for (String value : values) {
                if (!value.trim().isEmpty()) {
                    numbers.add(Integer.parseInt(value.trim()));
                }
            }
        }

        // Check if the list is empty
        if (numbers.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        // Get the sum of the numbers in the list
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Get the output TXT file name
        String outputFileName = inputFilePath.replace(".csv", ".txt");

        // Create a PrintWriter object to write the output file
        PrintWriter writer = new PrintWriter(new File(outputFileName));

        // Write the sum of the numbers to the output file
        writer.println(sum);

        // Close the output file
        writer.close();

        System.out.println("File " + outputFileName + " has been written.");
    
    }
}

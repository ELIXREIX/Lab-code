package week6;
import java.util.Scanner; 

public class Array2Dinput { 

    public static void main(String[] args) { 

        int [][] matrix = new int [5][4]; 

        Scanner sc = new Scanner(System.in); 

        for (int i = 0 ; i < matrix.length ; i++) { 

             

            for (int j = 0 ; j < matrix[i].length ; j++) { 

                System.out.print("Enter element for row " + (i+1) + " and column " + (j+1) + ": "); 

                matrix[i][j] = sc.nextInt(); 

            } 

        } 

        System.out.println("Matrix: "); 

        for (int i = 0 ; i < matrix.length ; i++) { 

             

            for (int j = 0 ; j < matrix[i].length ; j++) { 

             

            System.out.print(matrix[i][j] + "\t"); 

 
 

            } 

            System.out.println(); 

            sc.close(); 

        } 

    } 

} 


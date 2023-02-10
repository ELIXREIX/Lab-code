package week6;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        int [][] A = new int [3][3];
        int [][] B = new int [3][3];
        boolean Aa = true;
        boolean Bb = true;
        Scanner sc = new Scanner(System.in);
        while (Aa) {
        for (int i = 0 ; i < A.length ; i++) {
            
            for (int j = 0 ; j < A[i].length ; j++) {
                System.out.print("Enter element for A row " + (i+1) + " and column " + (j+1) + ": ");
                A[i][j] = sc.nextInt();
            }
            Aa = false;
        }
    }
        while (Bb) {
        for (int k = 0 ; k < B.length ; k++) {
            
            for (int l = 0 ; l < B[k].length ; l++) {
                System.out.print("Enter element for B row " + (k+1) + " and column " + (l+1) + ": ");
                B[k][l] = sc.nextInt();
            }
            Bb = false;
        }
        }
        boolean AA = true;
        boolean BB = true;
        System.out.println("A: ");
        while (AA) {
        for (int i = 0 ; i < A.length ; i++) {
            
            for (int j = 0 ; j < A[i].length ; j++) {
            
            System.out.print(A[i][j] + "\t");

        }
        System.out.println();
    }
    AA = false;
}       
        while (BB) {
        System.out.println("B: ");
        for (int k = 0 ; k < B.length ; k++) {

            for (int l = 0 ; l < B[k].length ; l++) {

            System.out.print(B[k][l] + "\t");
        }
        System.out.println();
    }
    BB = false;
}
    boolean CC = true;
    while (CC) {
        int C[][] = new int[3][3];
        for (int i = 0 ; i < C.length ; i++) {
            for (int j = 0 ; j < C[i].length ; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
            CC = false;
        }
        Boolean Cc = true;
        while (Cc) {
            System.out.println("C: ");
            for (int k = 0 ; k < C.length ; k++) {
                for (int l = 0 ; l < C[k].length ; l++) {
                    System.out.print(C[k][l] + "\t");
                }
                System.out.println();
            }
            Cc = false;
        }
        sc.close();
        }
    }
}


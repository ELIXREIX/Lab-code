package week6;

public class Array2Dlong {
    public static void main(String[] args) {
        int [][] matrix = new int [5][4];
        int count = 1;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = count++;
                if (count == 21) {
                    count = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}









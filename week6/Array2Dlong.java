package week6;

public class Array2Dlong {
    public static void main(String[] args) {
        int [][] matrix = new int [2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int [][]transposeMatrix = transposeMatrix(matrix);
        printMatrix(transposeMatrix);
    }

    static int[][] transposeMatrix (int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int [cols][rows];

        for (int i = 0; i < rows; ++i)
            for (int k = 0; k < cols; ++k)
                transposeMatrix[k][i] = matrix[i][k];

        return transposeMatrix;
    }
    static void printMatrix (int [][] matrix){
        for (int[] row : matrix){
            for(int elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
    }
}
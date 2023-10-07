//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

public class ZeroMatrix1_8 {
    public static void main(String[] args) {
        int N = 4;
        int M = 5;
        int[][] matrix;

        int num = 2;

        matrix = createMatrix(M, N);
        printMatrix(matrix, M, N);
        matrix = zeroColumnsMatrix(matrix, M, N);
        System.out.println();
        printMatrix(matrix, M, N);
    }

    public static int [][] createMatrix(int M, int N){
        int[][] matrix = new int[M][N];
        int num = -5;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        return matrix;
    }

    public static int[][] matrixZeros(int[][] matrix, int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
    public static int[][] zeroColumnsMatrix(int[][] matrix, int M, int N) {
        int[][] matrixZeros;
        matrixZeros = matrixZeros(matrix, M, N);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrixZeros[i][j] == 1) {
                    for(int k = 0; k < N; k++){
                        matrix[i][k] = 0;
                    }
                    for(int k = 0; k < M; k++){
                        matrix[k][j] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, int M, int N){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

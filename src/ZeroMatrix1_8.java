//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
public class ZeroMatrix1_8 {
    public static void main(String[] args) {
        int N = 4;
        int[][] matrix = new int[N][N];
        int[][] matrixZeros = new int[N][N];
        int[][] elementsZero

        int num = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = num;
                num++;
            }
        }


    }
}

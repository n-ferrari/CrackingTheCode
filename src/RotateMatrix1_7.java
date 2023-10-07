/*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
        bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

 */
public class RotateMatrix1_7 {
    public static void main(String[] args) {
        int N = 4;
        int[][] matrix = new int[N][N];

        int num = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        printMatrix(matrix, N);
        System.out.println();
        printMatrix(rotate90(matrix, N), N);
    }
    public static void printMatrix(int[][] matrix, int N){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate90(int[][] matrix, int N){
        int[][] matrix90 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix90[j][N - i - 1] = matrix[i][j];
            }
        }
        return matrix90;
    }
}

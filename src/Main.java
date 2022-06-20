public class Main {
    public static void main(String[] args) {
        int N = 2;
        int M = 3;
        int L = 4;
        int matrix1[][] = new int[N][M];
        int matrix2[][] = new int[M][L];
        int matrix3[][] = new int[N][L];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix1 [i][j] = 3;
                System.out.print(matrix1 [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < L; j++) {
                matrix2[i][j] = 7;
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
                System.out.println("\n");
        for (int i = 0; i < N; i++) {
            for (int y = 0; y < L; y++) {
                for (int j = 0; j < M; j++) {
                    matrix3[i][y] += matrix1[i][j] * matrix2[j][y];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
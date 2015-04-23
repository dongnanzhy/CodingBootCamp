package HW2;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        	return;
        }
        int N = matrix.length;
        for (int i = 0; i < N / 2; i++) {
        	for (int j = 0; j < (N + 1)/ 2; j++) {
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[N - j - 1][i];
        		matrix[N - j - 1][i] = matrix[N - i -1][N - j - 1];
        		matrix[N - i -1][N - j - 1] = matrix[j][N - i - 1];
        		matrix[j][N - i - 1] = tmp;
        	}
        }
    }
}

package HW2;

public class MatrixToZero {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        	return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow0 = false;
        boolean firstCol0 = false;
        
        for (int i = 0; i < cols; i++) {
        	if (matrix[0][i] == 0) {
        		firstRow0 = true;
        		break;
        	}
        }
        for (int i = 0; i < rows; i++) {
        	if (matrix[i][0] == 0) {
        		firstCol0 = true;
        		break;
        	}
        }
        
        for (int i = 1; i < rows; i++) {
        	for (int j = 1; j < cols; j++) {
        		if (matrix[i][j] == 0) {
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        		}
        	}
        }
        for (int i = 1; i < rows; i++) {
        	for (int j = 1; j < cols; j++) {
        		if (matrix[i][0] == 0 || matrix[0][j] == 0) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        
        if (firstRow0) {
        	for (int i = 0; i < cols; i++) {
        		matrix[0][i] = 0;
        	}
        }
        if (firstCol0) {
        	for (int i = 0; i < rows; i++) {
        		matrix[i][0] = 0;
        	}
        }
    }
}

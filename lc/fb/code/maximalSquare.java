public class Solution { 
	public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        
        int[][] square = new int[matrix.length + 1][matrix[0].length + 1];
        int result = 0;
        
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    square[i][j] = Math.min(Math.min(square[i - 1][j], 
                    	square[i][j - 1]),square[i - 1][j - 1]) + 1;
                    result = Math.max(result, square[i][j]);
                }
            }
        }
        
        return result * result;
	}
}
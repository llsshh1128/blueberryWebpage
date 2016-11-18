public class Solution { 
	public boolean wordSearch(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }
        
        char[] arr = word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] ==arr[0]) {
                    visited[i][j] = true;
                    if (dfs(arr, board, i, j, 0, visited)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[] arr, char[][] board, int i, int j, 
    	                int idx, boolean[][] visited) {
        if (idx >= arr.length - 1) {
            return true;
        }
        
        int row = board.length;
        int col = board[0].length;
        
        boolean hasWord = false;
        
        if (i + 1 < row && !visited[i + 1][j] 
        	&& arr[idx + 1] == board[i + 1][j]) {
            visited[i + 1][j] = true;
            hasWord = dfs(arr, board, i + 1, j, idx + 1, visited);
            if (hasWord) {
                return true;
            }
            visited[i + 1][j] = false;
        }
        
        if (i - 1 >= 0 && !visited[i - 1][j] 
        	&& arr[idx + 1] == board[i - 1][j]) {
            visited[i - 1][j] = true;
            hasWord = dfs(arr, board, i - 1, j, idx + 1, visited);
            if (hasWord) {
                return true;
            }
            visited[i - 1][j] = false;
        }
        
        if (j + 1 < col && !visited[i][j + 1] 
        	&& arr[idx + 1] == board[i][j + 1]) {
            visited[i][j + 1] = true;
            hasWord = dfs(arr, board, i, j + 1, idx + 1, visited);
            if (hasWord) {
                return true;
            }
            visited[i][j + 1] = false;
        }
        
        if (j - 1 >= 0 && !visited[i][j - 1] 
        	&& arr[idx + 1] == board[i][j - 1]) {
            visited[i][j - 1] = true;
            hasWord = dfs(arr, board, i, j - 1, idx + 1, visited);
            if (hasWord) {
                return true;
            }
            visited[i][j - 1] = false;
        }
        
        return false;
        
	}
}
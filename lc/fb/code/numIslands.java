public class Solution { 
	public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        
        int count = 0;
        
        boolean[][] visited = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    Queue<Pair> queue = new LinkedList<Pair>();
                    queue.add(new Pair(i,j));
                    visited[i][j] = true;
                    count++;
                    
                    while (!queue.isEmpty()) {
                        Pair cd = queue.poll();
                        int x = cd.x;
                        int y = cd.y;
                        
                        if (x - 1 >= 0 && grid[x - 1][y] == '1' && !visited[x - 1][y]) {
                            queue.offer(new Pair(x - 1, y));
                            visited[x - 1][y] = true;
                        }
                        
                        if (x + 1 < row && grid[x + 1][y] == '1' && !visited[x + 1][y]) {
                            queue.offer(new Pair(x + 1, y));
                            visited[x + 1][y] = true;
                        }
                        
                        if (y - 1 >= 0 && grid[x][y - 1] == '1' && !visited[x][y - 1])  {
                            queue.offer(new Pair(x, y - 1));
                            visited[x][y - 1] = true;
                        }
                        
                        if (y + 1 < col && grid[x][y + 1] == '1' && !visited[x][y + 1]) {
                            queue.offer(new Pair(x, y + 1));
                            visited[x][y + 1] = true;
                        }
                        
                    }
                }
            }
        }
        
        return count;
    }
    
    public class Pair {
        int x;
        int y;
        
        public Pair(int xc, int yc) {
            this.x = xc;
            this.y = yc;
        }
    }
}
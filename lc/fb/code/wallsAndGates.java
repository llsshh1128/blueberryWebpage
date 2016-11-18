public class Solution { 
	public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0) {
            return;
        }
        
        int row = rooms.length;
        int col = rooms[0].length;
        
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rooms[i][j] == 0) {
                    boolean[][] visited = new boolean[row][col];
                    
                    Queue<Pair> queue = new LinkedList<Pair>();
                    queue.offer(new Pair(i,j,0));
                    while (!queue.isEmpty()) {
                        Pair head = queue.poll();
                        int x = head.x;
                        int y = head.y;
                        int dist = head.dist;
                        
                        if (x - 1 >= 0 && rooms[x - 1][y] > 0 
                        	&& !visited[x - 1][y]) {
                            rooms[x - 1][y] = Math.min(rooms[x - 1][y], 
                            	                       dist + 1);
                            queue.offer(new Pair(x - 1, y, dist + 1));
                            visited[x - 1][y] = true;
                        }
                        
                        if (y - 1 >= 0 && rooms[x][y - 1] > 0 
                        	&& !visited[x][y - 1]) {
                            rooms[x][y - 1] = Math.min(rooms[x][y - 1], 
                            	                       dist + 1);
                            queue.offer(new Pair(x, y - 1, dist + 1));
                            visited[x][y - 1] = true;
                        }
                        
                        if (x + 1 < row && rooms[x + 1][y] > 0 
                        	&& !visited[x + 1][y]) {
                            rooms[x + 1][y] = Math.min(rooms[x + 1][y], 
                            	                       dist + 1);
                            queue.offer(new Pair(x + 1, y, dist + 1));
                            visited[x + 1][y] = true;
                        }
                        
                        if (y + 1 < col && rooms[x][y + 1] > 0 
                        	&& !visited[x][y + 1]) {
                            rooms[x][y + 1] = Math.min(rooms[x][y + 1], 
                            	                       dist + 1);
                            queue.offer(new Pair(x, y + 1, dist + 1));
                            visited[x][y + 1] = true;
                        }
                    }
                    
                } 
            }
        }
        
    }
    
    public class Pair {
        int x;
        int y;
        int dist;
        public Pair(int xc, int yc, int d) {
            this.x = xc;
            this.y = yc;
            this.dist = d;
        }
	}
}
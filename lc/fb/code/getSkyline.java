public class Solution { 
	public List<int[]> getSkyline(int[][] buildings) {
        if (buildings == null || buildings.length == 0) {
            return new ArrayList<int[]>();
        }
        
        List<int[]> height = new ArrayList<int[]>();
        
        for (int[] record : buildings) {
            height.add(new int[]{record[0],record[2]});
            height.add(new int[]{record[1],-record[2]});
        }
        
        Collections.sort(height, new Comparator<int[]>(){
           @Override
           public int compare(int[] arr1, int[] arr2) {
               if (arr1[0] != arr2[0]) {
                   return arr1[0] - arr2[0];
               } else {
                   return arr2[1] - arr1[1];
               }
           }
        });
        
        List<int[]> res = new ArrayList<int[]>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1, 
        	                            new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        
        pq.offer(0);
    
        int preMax = 0;
        
        for (int[] h : height) {
            if (h[1] > 0) {
                pq.offer(h[1]);
            } else {
                pq.remove(-h[1]);
            }
            
            if (pq.peek() != preMax) {
                preMax = pq.peek();
                res.add(new int[]{h[0],preMax});
            }
            
        }
        
        return res;
	}
}
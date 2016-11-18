public class Solution { 
	public int meetingRooms2(Interval[] intervals) {
        int maxRooms = 0;
        
        if (intervals.length == 0) {
            return maxRooms;
        }
        
        Arrays.sort(intervals, new Comparator<Interval>(){
           @Override
           public int compare(Interval t1, Interval t2) {
               return t1.start - t2.start;
           }
        });
        
        Queue<Interval> pq = new PriorityQueue<Interval>(1, 
        	                     new Comparator<Interval>(){
            @Override
            public int compare(Interval t1, Interval t2) {
                return t1.end - t2.end;
            }
        });
        
        int count = 0;
        
        for (int i = 0; i < intervals.length; i++) {
            pq.offer(intervals[i]);
            count++;
            
            while (!pq.isEmpty() && pq.peek().end <= intervals[i].start) {
                Interval first = pq.poll();
                count--;
            }
            
            maxRooms = Math.max(count,maxRooms);
        }
        
        return maxRooms;
	}
}
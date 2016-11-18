/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class Solution { 
	public boolean meetingRooms(Interval[] intervals) {
        if (intervals.length == 0) {
            return true;
        }
        
        Arrays.sort(intervals, new Comparator<Interval>(){
           @Override
           public int compare(Interval t1, Interval t2) {
               return t1.start - t2.start;
           }
        });
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }
        
        return true;
	}
}
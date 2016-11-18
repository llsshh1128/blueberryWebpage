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
    public List<Interval> insert(List<Interval> intervals, 
    	                         Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        
        if (newInterval == null) {
            return intervals;
        }
        
        if (intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }
        
        int index = 0;
        
        int ns = newInterval.start;
        int ne = newInterval.end;
        
        // 1.intervals before the merged one
        while(index < intervals.size() 
        	  && intervals.get(index).end < ns){
            res.add(intervals.get(index));
            index++;
        }
        
        Interval itv = new Interval(ns,ne);
        
        // 2.process the merged interval
        
        if (index < intervals.size()) {
            itv.start = intervals.get(index).start > ns 
                        ? ns : intervals.get(index).start;
            
            while (index < intervals.size() 
            	   && intervals.get(index).start <= ne) {
                index++;
            }
            
            if (index == 0) {
                itv.end = ne;
            } else {
                itv.end = intervals.get(index - 1).end < ne 
                          ? ne : intervals.get(index - 1).end;
            }
            
        }
        
        res.add(itv);
        
        
        // 3.intervals after the merged one
        while(index< intervals.size()){
            res.add(intervals.get(index));
            index++;
        }
        
        return res;
        
    }
}
public class Solution { 
	public List<Intervals> mergeIntervals(List<Interval> intervals) {
		List<Interval> result = new ArrayList<>();
        
        if (intervals.size() == 0) {
            return result;
        }
        
        Collections.sort(intervals, new Comparator<Interval>() {
           @Override
           public int compare(Interval i1, Interval i2) {
               return i1.start - i2.start;
           }
        });
        
        int left = intervals.get(0).start;
        int right = intervals.get(0).end;
        
        for (int i = 1; i < intervals.size(); i++) {

            if (intervals.get(i).start > right) {
                result.add(new Interval(left,right));
                left = intervals.get(i).start;
                right = intervals.get(i).end;
            } else {
                if (intervals.get(i).end > right) {
                    right = intervals.get(i).end;
                }
            }
        }
        
        result.add(new Interval(left,right));
        
        return result;
	}
}
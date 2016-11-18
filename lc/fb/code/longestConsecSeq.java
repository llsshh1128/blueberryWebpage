public class Solution { 
	public int longestConsecSeq(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int maxLen = 1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int leftLen = (map.containsKey(nums[i] - 1)) ? 
                                      map.get(nums[i] - 1) : 0;
                int rightLen = (map.containsKey(nums[i] + 1)) ? 
                                      map.get(nums[i] + 1) : 0;
                
                int sum = leftLen + rightLen + 1;
                
                maxLen = Math.max(maxLen, sum);
                
                map.put(nums[i] - leftLen, sum);
                map.put(nums[i] + rightLen, sum);
                map.put(nums[i], sum);
            }
        }
        
        return maxLen;
	}
}
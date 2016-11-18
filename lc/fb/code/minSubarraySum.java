public class Solution { 
	public int minSubarraySum(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return nums[0] >= s ? 1 : 0;
        }
        
        int left = 0;
        int right = 0;
        int sum = nums[left];
        
        int minLen = Integer.MAX_VALUE;
        
        while (right + 1 < nums.length || sum >= s) {
            if (sum >= s) {
                if (left == right) {
                    return 1;
                }
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
                
            } else {
                while (right + 1 < nums.length && sum < s) {
                    sum += nums[++right];
                }
                
            }
        }
        
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        
        return minLen;
	}
}
public class Solution { 
	public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        return helper(nums, target, 0);
    }
    
    private int helper(int[] nums, int target, int sum) {
        if (sum > target) {
            return 0;
        }
        
        if (sum == target) {
            return 1;
        }
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            count += helper(nums, target, sum + nums[i]);
        }
        
        return count;
    }
}
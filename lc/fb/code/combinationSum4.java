public class Solution { 
	public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] res = new int[target + 1];
        
        for (int j = 0; j < nums.length; j++) {
            if (target >= nums[j]) {
                res[nums[j]] = 1;
            }
        }
        
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j])
                    res[i] += res[i - nums[j]];
            }
        }
        
        return res[target];
    }
    
}
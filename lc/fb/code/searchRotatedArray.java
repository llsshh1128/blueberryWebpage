public class Solution { 
	public int searchRotatedArray(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        
        while(right - left > 1) {
            mid = left + (right - left) / 2;
            
            if (nums[left] == target) {
                return left;
            }
            
            if (nums[right] == target) {
                return right;
            }
            
            
            if (nums[mid] > nums[left] && nums[mid] < nums[right]) {
                if (target >= nums[left] && target <= nums[mid])
                    right = mid;
                else
                    left = mid;
            } else if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid;
                }
            } else if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            
        }
        
        if (nums[left] == target)
            return left;
        if (nums[right] == target)
            return right;
            
        return -1;
	}
}
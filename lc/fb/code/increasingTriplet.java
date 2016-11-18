public class Solution {
	public boolean increasingTriplet(int[] nums) {
		if (nums.length < 3) {
            return false;
        }
        
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > big) {
                return true;
            } else if (nums[i] > small) {
                big = nums[i];
            } else {
                small = nums[i];
            }    
            
        }
        
        return false;

		
	}


	public boolean increasingTriplet2(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        
        int smallest = nums[0];
        int smaller = Integer.MAX_VALUE;
        
        int tempS = smallest;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > smaller) {
                return true;
            } else {
                if (nums[i] < smaller && nums[i] > tempS) {
                    smallest = tempS;
                    smaller = nums[i];
                } else if (nums[i] < tempS) {
                    if (smaller == Integer.MAX_VALUE) {
                        smallest = nums[i];
                        tempS = smallest;
                    } else {
                        tempS = nums[i];
                    }
                }
                
            }
        }
        
        return false;
        
	}
}
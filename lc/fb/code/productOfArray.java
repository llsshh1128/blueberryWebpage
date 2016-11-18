public class Solution { 
	public int[] productOfArray(int[] nums) {
        int len = nums.length;
        
        int[] product1 = new int[len];
        int[] product2 = new int[len];
        int[] res = new int[len];
        
        product1[0] = nums[0];
        product2[len - 1] = nums[len - 1];
        
        for (int i = 1; i < len; i++) {
            product1[i] = product1[i - 1] * nums[i];
            
        }
        
        for (int j = len - 2; j >= 0; j--) {
            product2[j] = product2[j + 1] * nums[j];
        }
        
        res[0] = product2[1];
        res[len - 1] = product1[len - 2];
        
        if (len == 2) {
            return res;
        }
        
        for (int k = 1; k < len - 1; k++) {
            res[k] = product1[k - 1] * product2[k + 1];
        }
        
        return res;
	}
}
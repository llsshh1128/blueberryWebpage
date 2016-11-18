public class Solution { 
	public void mergeSortedArray(int[] nums1, int m, 
		                         int[] nums2, int n) {
        int idx1 = m -1;
        int idx2 = n - 1;
        
        int index = m + n - 1;
        
        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] >= nums2[idx2]) {
                nums1[index] = nums1[idx1];
                idx1--;
            } else {
                nums1[index] = nums2[idx2];
                idx2--;
            }
            
            index--;
        }
        
        if (idx2 >= 0) {
            while (index >= 0) {
                nums1[index] = nums2[index];
                index--;
            }
        }
	}
}
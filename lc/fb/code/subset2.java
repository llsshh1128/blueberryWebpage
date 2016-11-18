public class Solution { 
	public List<List<Integer>> subset2(int[] nums) {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        if (nums.length == 0)
            return res;
            
        Arrays.sort(nums);
        
        helper(res, new ArrayList<Integer>(), 0, nums);
        
        return res;
    }
    
    private void helper(List<List<Integer>> res, 
    	                List<Integer> list, 
    	                int index, 
    	                int[] nums) {
        if (index >= nums.length) {
            return;
        }
        
        for (int i = index; i < nums.length; i++) {
            if (i == index || (i != index && nums[i] != nums[i - 1])) {
                list.add(nums[i]);
                res.add(new ArrayList<Integer>(list));
                helper(res, list, i + 1, nums);
                list.remove(list.size() - 1);
            }
        }
        
    }
	}
}
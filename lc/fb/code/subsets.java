cpublic class Solution { 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (nums.length == 0) {
            return res;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        res.add(list);
        
        dfs(res,list,nums,0);
        
        return res;
    }
    
    private void dfs(List<List<Integer>> res, 
    	             List<Integer> list, 
    	             int[] nums, 
    	             int start) {
        if (start >= nums.length) {
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            res.add(new ArrayList<Integer>(list));
            
            dfs(res,list,nums,i + 1);
            
            list.remove(list.size() - 1);
            
        }
    }
}
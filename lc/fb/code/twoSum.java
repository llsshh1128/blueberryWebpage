public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return null;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] index = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                index[0] = map.get(target - nums[i]);
                index[1] = i;
                return index;
            }
            map.put(nums[i],i);
        }
        
        return null;
    }
}
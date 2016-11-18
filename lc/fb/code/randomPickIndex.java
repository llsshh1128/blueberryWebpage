public class Solution { 
    HashMap<Integer,List<Integer>> map = new HashMap<>();

    
    public Solution(int[] nums) {
        map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
    }
    
    public int pick(int target) {
        Random rand = new Random();
        
        List<Integer> list = map.get(target);
        int index = rand.nextInt(list.size());
        
        return list.get(index);
    }
}
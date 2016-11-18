public class Solution { 
	HashSet<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        } else {
            set.add(val);
            list.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (set.contains(val)) {
            for (int i = 0; i < list.size(); i++) {
                if (val == list.get(i)) {
                    list.remove(i);
                    break;
                }
            }
            set.remove(val);
            return true;
        } else {
            return false;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        System.out.println(list.size());
        int index = rand.nextInt(list.size());
        
        return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

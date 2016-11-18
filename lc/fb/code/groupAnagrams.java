public class Solution { 
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        if (strs.length == 0) {
            return res;
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String s = "";
        
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            s = new String(arr);
            
            if (map.containsKey(s)) {
                list = map.get(s);
                
            } else {
                list = new ArrayList<>();

            }
            
            list.add(strs[i]);
            map.put(s,list);
        }
        
        for (String str : map.keySet()) {
            res.add(map.get(str));
        }
        
        return res;
	}
}
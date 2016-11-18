public class Solution { 
	public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        
        if (num == null || num.length() == 0) {
            return res;
        }
        
        helper(res, num, "", 0, target, 0, 0);
        
        return res;
    }
    
    private void helper(List<String> res, String num, String str, int start, int target, long multi, long sum) {
        
        if (start >= num.length()) {
            
            if (sum == target) {
                res.add(str);
            }
            return;
        }
        
        for(int i = start; i < num.length(); i++){
            if (i != start && num.charAt(start) == '0') 
                break;
            
            long cur = Long.parseLong(num.substring(start, i + 1));
            
            if (start == 0) {
                helper(res, num, str + cur, i + 1, target, cur, cur);
            } else {
                helper(res, num, str + "+" + cur, i + 1, target, cur, sum + cur);
                helper(res, num, str + "-" + cur, i + 1, target, -cur, sum - cur);
                helper(res, num, str + "*" + cur, i + 1, target, multi * cur, sum - multi + multi * cur);
            }
        }
        
        
        
    }
	}
}
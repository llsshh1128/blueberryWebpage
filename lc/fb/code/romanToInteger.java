public class Solution { 
	public int romanToInteger(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        
        int pre = map.get(arr[0]);
        int sum = pre;
        
        for (int i = 1; i < s.length(); i++) {
            int cur = map.get(arr[i]);
            pre = map.get(arr[i - 1]);
            
            if (pre < cur) {
                sum = sum - pre - pre + cur;
            } else {
                sum += cur;
            }
        }
        
        return sum;
        
	}
}
public class Solution { 
	public String countAndSay(int n) {
        if (n == 0) {
            return "1";
        }
        
        String s = "1";
        
        for (int i = 1; i < n; i++) {
            int len = s.length();
            int count = 0;
            
            char pre = '0';
            char[] arr = s.toCharArray();
            
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < len; j++) {
                if (arr[j] != pre) {
                    if (count != 0) {
                        sb.append(count + "").append(pre);
                    }
                    pre = arr[j];
                    count = 1;
                } else {
                    count++;
                }
            }
            
            sb.append(count + "").append(pre);
            
            s = sb.toString();
        }
        
        return s;
	}
}
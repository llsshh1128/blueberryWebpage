public class Solution { 
	public boolean wordBreak(String s, Set<String> wordDict) {
		if (wordDict.size() == 0) {
            return false;
        }
        
        boolean[] result = new boolean[s.length() + 1];
        char[] charArr = s.toCharArray();
        
        result[s.length()] = true;
        
        for (int i = charArr.length; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
               if (result[i] 
               	    && wordDict.contains(s.substring(j,i))) {
                   result[j] = true;
               } 
            }
        }
        
        return result[0];
	}
}
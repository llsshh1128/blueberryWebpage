public class Solution {
	private int count;

    public int numDecodings(String s) {
    	count = 0;

        if (s.length() == 0) {
        	return count;
        }

        helper(s,0);

        return count;

    }


    private void helper(String s, int index) {
    	if (index == s.length()) {
    		count++;
    		return;
    	}

    	int digit = s.charAt(index) - '0';

    	if (digit == 1) {
    		helper(s, index + 1);
    		if (index + 1 < s.length()){
    			helper(s, index + 2);
    		}
    	} else if (digit == 2) {
    		helper(s, index + 1);
    		if (index + 1 < s.length() 
    			&& s.charAt(index + 1) - '0' <= 6) {
				helper(s, index + 2);
			}
    	} else if (digit == 0){
    		return;
    	} else {
    		helper(s, index + 1);
    	}

    }
}
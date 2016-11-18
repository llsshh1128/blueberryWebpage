public class Solution { 
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        char leftChar;
        char rightChar;
    
        while (left < right) {
            leftChar = Character.toLowerCase(s.charAt(left));
            rightChar = Character.toLowerCase(s.charAt(right));
            
            if (isAlphaNum(leftChar) && isAlphaNum(rightChar)) {
                if (leftChar == rightChar) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            } else {
                if (!isAlphaNum(leftChar)) {
                    left++;
                }
                
                if (!isAlphaNum(rightChar)) {
                    right--;
                }
            } 
            
            
        }
        
        return true;
        
        
    }
    
    private boolean isAlphaNum(char c) {
        
        if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
            return true;
        }
        
        return false;
    }
}
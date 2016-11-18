public class Solution {
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            return addBinary(b,a);
        }
        
        if (a.length() == 0) {
            return b;
        }
        
        int caryy = 0;
        int i = 0;
        int sum = 0;
        int carry = 0;
        
        String result = "";
        
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        
        while (i < a.length()) {
            sum = (arr1[arr1.length - 1 - i] - '0') 
                + (arr2[arr2.length - 1 - i] - '0') 
                + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
            i++;
        }
        
        while(i < b.length()) {
            sum = (arr2[arr2.length - 1 - i] - '0') + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
            i++;
        }
        
        if (carry == 1) {
            result = "1" + result;
        }
        
        return result;
        
        
    }
}
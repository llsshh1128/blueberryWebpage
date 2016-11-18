public class Solution { 
	public String multiplyString(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
       
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int product = (arr1[i] - '0') * (arr2[j] - '0');
                int sum = res[i + j + 1] + product;
                
                res[i + j] += sum / 10;
                res[i + j + 1] = sum % 10;
            }
        }  
        
        StringBuilder sb = new StringBuilder();
        
        for(int p : res) {
            if(!(sb.length() == 0 && p == 0)) 
                sb.append(p);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
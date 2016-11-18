public class Solution {
	public int numDecodings(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int[] count = new int[s.length() + 1];
		char[] charArr = s.toCharArray();
		
		count[0] = 1;
		count[1] = charArr[0] == '0' ? 0 : 1;

		for (int i = 2; i <= s.length(); i++) {
		   int first = Integer.valueOf(s.substring(i - 1, i));
		   int second = Integer.valueOf(s.substring(i - 2, i));
		   
		   if (first != 0) {
		       count[i] += count[i - 1];
		   }
		   
		   if (second >= 10 && second <= 26) {
		       count[i] += count[i - 2];
		   }
		}
		
		return count[s.length()];
		
	}
			
}
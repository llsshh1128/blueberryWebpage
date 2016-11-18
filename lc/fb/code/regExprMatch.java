public class Solution { 
	public boolean regExprMatch(String s, String p) {
		int len1 = s.length();
		int len2 = p.length();
		
		if (s == null || p == null) {
		    return false;
		}

		boolean[][] results = new boolean[len1 + 1][len2 + 1];
		results[0][0] = true;

		for (int j = 1; j < len2; j++) {
			if (p.charAt(j) == '*' && results[0][j - 1]) {
				results[0][j + 1] = true;
			}
		}

		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (p.charAt(j) == '.') {
					results[i + 1][j + 1] = results[i][j]; 
				}

				if (p.charAt(j) == s.charAt(i)) {
					results[i + 1][j + 1] = results[i][j];
				}

				if (p.charAt(j) == '*') {
					if (p.charAt(j - 1) != s.charAt(i) 
						&& p.charAt(j - 1) != '.') {
						results[i + 1][j + 1] 
						= results[i + 1][j - 1];
					} else {
						results[i + 1][j + 1] 
							= results[i + 1][j] 
							|| results[i + 1][j - 1]
							|| results[i][j + 1];
					}
				}
			}
		}

		return results[len1][len2]; 


	}
}
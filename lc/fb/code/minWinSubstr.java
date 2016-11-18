public class Solution { 
	public String minWinSubstr(String s, String t) {
		if (s == null || t == null) {
			return null;
		}

		int len1 = s.length();
		int len2 = t.length();

		if (len1 == 0 || len2 == 0) {
			return "";
		}

		HashMap<Character,Integer> map = new HashMap<>();
		HashSet<Character> set = new HashSet<>();

		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();

		int left = 0;
		// int right = 0;

		int minLen = Integer.MAX_VALUE;
		String result = "";

		for (int j = 0; j < len2; j++) {
			if (!map.containsKey(arr2[j])) {
				map.put(arr2[j],0);
			} else {
				int temp = map.get(arr2[j]);
				temp++;
				map.put(arr2[j],temp);
			}
		}

		




		

		if (minLen == Integer.MAX_VALUE) {
			return "";
		}

		return result;
	}
}
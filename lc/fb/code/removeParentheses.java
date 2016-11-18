public class Solution { 
	public List<String> removeParentheses(String s) {
		List<String> result = new ArrayList<String>();
        
        if (s == null) {
            return result;
        }

		HashSet<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();

		boolean findValid = false;

		queue.offer(s);
		visited.add(s);

        int count = 1;
        
		while (!queue.isEmpty()) {
			String str = queue.poll();

			if (isValid(str)) {
				result.add(str);
				findValid = true;
			}

			if (findValid) {
				continue;
			}

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' 
						|| str.charAt(i) == ')') {
				    
					String temp = str.substring(0,i) 
						+ str.substring(i + 1);

					if (!visited.contains(temp)) {
						visited.add(temp);
						queue.offer(temp);
					}
				}
			}


		}

		return result;
	}

	private boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int k = 0; k < str.length(); k++) {
			if (str.charAt(k) == '(') {
				stack.push('(');
			} else if (str.charAt(k) ==')') {
				if (stack.size() == 0) {
					return false;
				}

				stack.pop();
			}
		}

		if (stack.size() != 0) {
			return false;
		}

		return true;
	}
}
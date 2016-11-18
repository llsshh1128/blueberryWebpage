.. _Regular_Expression_Matching:

================================
Regular Expression Matching (10)
================================

**Dynamic Programming**

Implement regular expression matching with support for '.' and '*'.

| '.' Matches any single character.
| '*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

| The function prototype should be: 
| public boolean isMatch(String s, String p)

| Some examples:
| isMatch("aa","a") → false
| isMatch("aa","aa") → true
| isMatch("aaa","aa") → false
| isMatch("aa", "a*") → true
| isMatch("aa", ".*") → true
| isMatch("ab", ".*") → true
| isMatch("aab", "c*a*b") → true

|

**Solution**

| State: dp[i][j] -> s[0:i-1] and p[0:j-1] match or not
| Initial state: 
| State function: 

1. p.charAt(j) == s.charAt(i)  ==>  result[i][i] = result[i - 1][j - 1]
2. p.charAt(j) == '.'  ==>  result[i][j] = result[i - 1][j - 1];
3. p.charAt(j) == '*'
	#. 

.. literalinclude:: ./code/regExprMatch.java
   :language: java
   :linenos:
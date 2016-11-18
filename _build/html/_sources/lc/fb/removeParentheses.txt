.. _Remove_Invalid_Parentheses:

=================================
Remove Invalid Parentheses (301)
=================================

**BFS**

Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible results.

Note: The input string may contain letters other than the parentheses ( and ).

Examples:
| "()())()" -> ["()()()", "(())()"]
| "(a)())()" -> ["(a)()()", "(a())()"]
| ")(" -> [""]

|

**Solution**

1. BFS every level with removal of one ( or )
2. Use hashset to remove duplicates
3. Stop push string into queue if the valid string is found
4. If one level has good answers, then the next level would be bad because it would contain odd number of parentheses

.. literalinclude:: ./code/removeParentheses.java
   :language: java
   :linenos:
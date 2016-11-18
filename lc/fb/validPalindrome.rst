.. _Valid_Palindrome:

==============================
Valid Palindrome (125)
==============================

**Two Pointers**

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

| For example,
| "A man, a plan, a canal: Panama" is a palindrome.
| "race a car" is not a palindrome.

|

**Solution**

1. Two pointers to compare every pair of characters
2. Using Character.toLowerCase(char c)

.. literalinclude:: ./code/validPalindrome.java
   :language: java
   :linenos:
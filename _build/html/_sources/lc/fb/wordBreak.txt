.. _Word_Break:

==============================
Word Break (139)
==============================

**Dynamic Programming**

Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

| For example, given
| s = "leetcode",
| dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

|

**Solution**

1. new result[strlen + 1]
2. Initial State: result[len] = true
3. State function: if (result[j] && wordDict.contains(s.substring(j,i)))
4. Return: result[0]

.. literalinclude:: ./code/wordBreak.java
   :language: java
   :linenos:
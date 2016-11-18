.. _Group_Anagrams:

==============================
Group Anagrams (49)
==============================

**Sort**

Given an array of strings, group anagrams together.

| For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
| Return:

| [
|   ["ate", "eat","tea"],
|   ["nat","tan"],
|   ["bat"]
| ]

Note: All inputs will be in lower-case.

|

**Solution**

1. Use hashmap to store all lists
2. The keySet of hashmap is the set of sorted string

.. literalinclude:: ./code/groupAnagrams.java
   :language: java
   :linenos:
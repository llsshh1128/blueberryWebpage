.. _Longest_Consecutive_Sequence:

===================================
Longest Consecutive Sequence (128)
===================================

**HashMap / Union Find**

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

| For example,
| Given [100, 4, 200, 1, 3, 2],
| The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.

|

**Solution**

HashMap Solution: 

1. curLen = Left sequence length + Right sequence length + 1
2. Update boundary point sequence length
3. Update maxLen if possible

.. literalinclude:: ./code/longestConsecSeq.java
   :language: java
   :linenos:

UnionFind Solution: 

.. literalinclude:: ./code/longestConsecSeqUF.java
   :language: java
   :linenos:

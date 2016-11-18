.. _3Sum:

===================
3Sum (15)
===================

**Two Pointer**

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

**Note:** The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:

[ [-1, 0, 1], [-1, -1, 2] ]

|

**Solution:**

1. Sort the whole array O(nlogn)
2. Duplicates of Pivot (i == 0 || i > 0)
3. Duplicates of left & right
4. Tip: Asignment of Variable -> TLE

.. literalinclude:: ./code/threeSum.java
   :language: java
   :linenos:
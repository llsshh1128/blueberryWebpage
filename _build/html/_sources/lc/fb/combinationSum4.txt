.. _Combination_Sum_IV:

==============================
Combination Sum IV (377)
==============================

**Dynamic Programming**

Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

Example:

| nums = [1, 2, 3]
| target = 4

| The possible combination ways are:
| (1, 1, 1, 1)
| (1, 1, 2)
| (1, 2, 1)
| (1, 3)
| (2, 1, 1)
| (2, 2)
| (3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.

| **Follow up:**
| What if negative numbers are allowed in the given array?
| How does it change the problem?
| What limitation we need to add to the question to allow negative numbers?

|

**Solution**

DP

1. Focus on how to manipulate it step by step in real life
2. Clearify what kind of array to use to record the results iteratively
3. res[i] += res[i - nums[j]]

.. literalinclude:: ./code/combinationSum4.java
   :language: java
   :linenos:

DFS (TLE)

.. literalinclude:: ./code/combinationSum4_DFS.java
   :language: java
   :linenos:
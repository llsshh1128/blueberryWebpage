.. _Minimum_Size_Subarray_Sum:

================================
Minimum Size Subarray Sum (209)
================================

**Two Pointers**

Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

| For example, given the array [2,3,1,2,4,3] and s = 7,
| the subarray [4,3] has the minimal length under the problem constraint.

|

**Solution**

1. Clearify boundary condition for while loop: right + 1 < len || sum >= s
2. Two cases inside loop: sum >= s; sum < s

.. literalinclude:: ./code/minSubarraySum.java
   :language: java
   :linenos:
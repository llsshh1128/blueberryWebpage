.. _Move_Zeros:

===================
Move Zeros (283)
===================

**Two Pointers** 

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

**Note:**

1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.

|

**Solution:**

1. Using i and j to record last non-zero number index and current index, respectively
2. Remember to set all the rest of positions to 0 after scan all numbers, if possible.

.. literalinclude:: ./code/MoveZeros.java
   :language: java
   :linenos:


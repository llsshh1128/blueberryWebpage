.. _Search_in_Rotated_Sorted_Array:

====================================
Search in Rotated Sorted Array (33)
====================================

**Binary Search**

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

|

**Solution**

1. Three cases: 1,2,3,4,5,6,7;  4,5,6,7,1,2,3;  6,7,1,2,3,4,5
2. while loop condition: right - left > 1

.. literalinclude:: ./code/searchRotatedArray.java
   :language: java
   :linenos:
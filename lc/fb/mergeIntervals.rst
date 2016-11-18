.. _Merge_Intervals:

==============================
Merge Intervals (56)
==============================

**Two Pointers**

Given a collection of intervals, merge all overlapping intervals.

| For example,
| Given [1,3],[2,6],[8,10],[15,18],
| return [1,6],[8,10],[15,18].

|

**Solution**

1. Sort the list by start number
2. Using left and right pointers to record current range
3. If the range boundary found, add it into result list

.. literalinclude:: ./code/mergeIntervals.java
   :language: java
   :linenos:
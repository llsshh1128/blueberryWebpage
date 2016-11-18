.. _Insert_Interval:

==============================
Insert Interval (57)
==============================

**Loop**

Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

| Example 1:
| Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

| Example 2:
| Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

|

**Solution**

1. Insert intervals before merge
2. Merge intervals (boundary condition: newInterval before unique interval)
3. Insert intervals after merge

.. literalinclude:: ./code/insertInterval.java
   :language: java
   :linenos:
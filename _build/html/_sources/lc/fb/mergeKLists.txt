.. _Merge_K_Sorted_Lists:

==============================
Merge K Sorted Lists (23)
==============================

**PriorityQueue**

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

|

**Solution**

1. PriorityQueue, comparator
2. Dummy node and previous node
3. Time complexity: O(nlogk)

.. literalinclude:: ./code/mergeKLists.java
   :language: java
   :linenos:
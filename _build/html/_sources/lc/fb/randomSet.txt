.. _Insert_Delete_GetRandom_O(1):

===================================
Insert Delete GetRandom O(1) (380)
===================================

**HashMap**

Design a data structure that supports all following operations in average O(1) time.

1. insert(val): Inserts an item val to the set if not already present.
2. remove(val): Removes an item val from the set if present.
3. getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.

|

**Solution**

If removal needed, first swap last int and removal, then update the last one index, then remove it.

.. literalinclude:: ./code/randomSet.java
   :language: java
   :linenos:
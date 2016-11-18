.. _Subset_II:

==============================
Subset II (90)
==============================

**Backtracking**

Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

| For example,
| If nums = [1,2,2], a solution is:

| [
|   [2],
|   [1],
|   [1,2,2],
|   [2,2],
|   [1,2],
|   []
| ]


|

**Solution**

1. Be careful of duplicates when adding to result list (no adding during final state)

.. literalinclude:: ./code/subset2.java
   :language: java
   :linenos:
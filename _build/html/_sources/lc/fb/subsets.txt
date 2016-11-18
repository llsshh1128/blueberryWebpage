.. _Subsets:

==============================
Subsets (78)
==============================

**Backtracking**

Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

| For example,
| If nums = [1,2,3], a solution is:

| [
|   [3],
|   [1],
|   [2],
|   [1,2,3],
|   [1,3],
|   [2,3],
|   [1,2],
|   []
| ]

|

**Solution**

1. Remember to use result.add(new ArrayList<Integer>(list))
2. Remember to remove the element from the list after dfs helper function

.. literalinclude:: ./code/subsets.java
   :language: java
   :linenos:
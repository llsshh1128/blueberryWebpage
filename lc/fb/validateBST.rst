.. _Validate_BST:

==============================
Validate BST (98)
==============================

**DFS**

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

| The left subtree of a node contains only nodes with keys less than the node's key.
| The right subtree of a node contains only nodes with keys greater than the node's key.
| Both the left and right subtrees must also be binary search trees.

|

**Solution**

1. Construct a class with max, min and isValid
2. Using helper function to traverse all nodes
3. Check if the node value is greater than the largest value of left subtree, and is less than the smallest value of right subtree
4. Final state: if the node is the leaf, return true. Min value and max value are both equal to node value.

.. literalinclude:: ./code/validateBST.java
   :language: java
   :linenos:
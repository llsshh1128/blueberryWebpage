.. _Inorder_Successor_in_BST:

==============================
Inorder Successor in BST (285)
==============================

**Recursion**

Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.

|

**Solution**

1. Three cases: has right subtree, no right subtree but is others' left subtree, no right subtree and is not others' left subtree
2. Recursion to change root and find the suitable root

.. literalinclude:: ./code/successorBST.java
   :language: java
   :linenos:


.. literalinclude:: ./code/predecessorBST.java
   :language: java
   :linenos:
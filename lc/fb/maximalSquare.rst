.. _Maximal_Square:

==============================
Maximal Square (221)
==============================

**Dynamic Programming**

Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

For example, given the following matrix:

| 1 0 1 0 0
| 1 0 1 1 1
| 1 1 1 1 1
| 1 0 0 1 0
| Return 4.

|

**Solution**

1. 2D matrix to record the maximal square using this point as bottome right point
2. res[i][j] = min {res[i - 1][j - 1], res[i - 1][j], res[i][j - 1]}

.. literalinclude:: ./code/maximalSquare.java
   :language: java
   :linenos:
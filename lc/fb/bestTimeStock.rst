.. _Best_Time_to_Buy_and_Sell_Stock:

==========================================
Best Time to Buy and Sell Stock (121)
==========================================

**Two Pointers**

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

|

**Solution**

1. Two variables/pointers: current min, current max profit
2. O(n) time, O(1) space

.. literalinclude:: ./code/bestTimeStock.java
   :language: java
   :linenos:
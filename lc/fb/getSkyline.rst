.. _The_Skyline_Problem:

==============================
The Skyline Problem (218)
==============================

**Heap**

A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. Now suppose you are given the locations and height of all the buildings as shown on a cityscape photo (Figure A), write a program to output the skyline formed by these buildings collectively (Figure B).

.. figure:: ./pic/skylineA.png
   :align: center
   :scale: 50 %


.. figure:: ./pic/skylineB.png
   :align: center
   :scale: 50 %

|

**Solution**

1. Scanline Algorithm: to check every key points that coudl possible lead to change
2. Using a List<int[]> list to store all possible key points -> [start, height], [end, -height]
3. Sort the key points list by x coordinates (p.s. if start and end are at same x, start comes first)
4. Use PriorityQueue to put all current existing heights
5. For each key point, after adding or removing key point from the list, if the current max height is NOT equal to previous max height, then update previous max height and add this key point into result list

.. literalinclude:: ./code/getSkyline.java
   :language: java
   :linenos:
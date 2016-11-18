.. _Sort_Colors:

==============================
Sort Colors (75)
==============================

**Two Pointers**

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

|

**Solution**

1. Throw all red to the left
2. Throw all blue to the right and go back to see if the current one is red. If so, throw red to the left
3. Leave white there

.. literalinclude:: ./code/sortColors.java
   :language: java
   :linenos:
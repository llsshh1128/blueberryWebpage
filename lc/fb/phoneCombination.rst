.. _Letter_Combinations_of_a_Phone_Number:

===========================================
Letter Combinations of a Phone Number (17)
===========================================

**Backtracing**

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

.. _phonePadFigure:

.. figure:: ./pic/phonePad.png
   :align: center
   :scale: 100 %

| Input:Digit string "23"
| Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

|

**Solution**

1. main function (corner case, call helper function)
2. helper function (final state, state function)

.. literalinclude:: ./code/phoneCombination.java
   :language: java
   :linenos:
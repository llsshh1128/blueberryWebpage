.. _Add_Binary:

===================
Add Binary (67)
===================

**Loop**

Given two binary strings, return their sum (also a binary string).

For example, 
a = "11", 
b = "1", 
Return "100".

|

**Solution:**

1. Guarantee the first string is the shorter one
2. The number of one specific digit is char - '0'
3. It's *Binary* operation, NOT decimal

.. literalinclude:: ./code/addBinary.java
   :language: java
   :linenos:
.. _Multiply_String:

==============================
Multiply String (43)
==============================

**Loop**

Given two numbers represented as strings, return multiplication of the numbers as a string.

| **Note:**
| The numbers can be arbitrarily large and are non-negative.
| Converting the input string to integer is NOT allowed.
| You should NOT use internal library such as BigInteger.

|

**Solution**

1. Follow mathematic calculation steps
2. Multiply every two single digits
3. Use int array to store resulted digits
4. Pay attention to the special case "result = 0 && digit = 0"

.. literalinclude:: ./code/multiplyString.java
   :language: java
   :linenos:
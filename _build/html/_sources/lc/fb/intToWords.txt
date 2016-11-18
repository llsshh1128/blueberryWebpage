.. _Integer_to_English_Words:

==============================
Integer to English Words (273)
==============================

**Divide and Conquer**

Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 2^31 - 1.

| For example,
| 123 -> "One Hundred Twenty Three"
| 12345 -> "Twelve Thousand Three Hundred Forty Five"
| 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

|

**Solution**

1. Every 3 digits could be a group
2. Create a subfunction to build three-digit word
3. Control spaces: where to add or remove spaces

.. literalinclude:: ./code/intToWords.java
   :language: java
   :linenos:
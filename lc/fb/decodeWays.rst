.. _Decode_Ways:

===================
Decode Ways (91)
===================

**Dynamic Programming**

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
. 
.
.
'Z' -> 26

Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.

|

**Solution1: DFS**

This code could not pass OJ due to TLE.

.. literalinclude:: ./code/decodeWaysDFS.java
   :language: java
   :linenos:

**Solution2: Dynamic Programming**

1. Create result[len + 1]
2. Initial state: result[0] = 1, result[1] = char == '0' ? 0 : 1;
3. State function: result[i] = result[i - 1] + result[i - 2], if they could represent letters
4. Return final state

.. literalinclude:: ./code/decodeWays.java
   :language: java
   :linenos:
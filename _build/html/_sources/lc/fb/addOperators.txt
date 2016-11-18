.. _Expression_Add_Operators:

==============================
Expression Add Operators (282)
==============================

**DFS / Divide and Conquer**

Given a string that contains only digits 0-9 and a target value, return all possibilities to add binary operators (not unary) +, -, or * between the digits so they evaluate to the target value.

| Examples: 
| "123", 6 -> ["1+2+3", "1*2*3"] 
| "232", 8 -> ["2*3+2", "2+3*2"]
| "105", 5 -> ["1*0+5","10-5"]
| "00", 0 -> ["0+0", "0-0", "0*0"]
| "3456237490", 9191 -> []

|

**Solution**

1. DFS to traverse all possible combinations
2. Three cases: +, -, *
3. Use for loop to parse numbers
4. Record previous product

.. literalinclude:: ./code/addOperators.java
   :language: java
   :linenos:
.. _Meeting_Rooms_II:

==============================
Meeting Rooms II (253)
==============================

**Heap**

Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

| For example,
| Given [[0, 30],[5, 10],[15, 20]],
| return 2.

|

**Solution**

1. Sort array by start time
2. Using PriorityQueue to store all current existing conferences sorted by end time
3. Scan intervals one by one, push it into PriorityQueue and remove all ended conferences
4. For each start time, calculate its currently existing conferences and update maxRooms if possible

.. literalinclude:: ./code/meetingRooms2.java
   :language: java
   :linenos:
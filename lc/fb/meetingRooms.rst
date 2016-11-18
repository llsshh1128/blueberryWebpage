.. _Meeting_Rooms:

==============================
Meeting Rooms (252)
==============================

**Sort**

Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

For example,
Given [[0, 30],[5, 10],[15, 20]],
return false.

|

**Solution**

Sort intervals by start time

.. literalinclude:: ./code/meetingRooms.java
   :language: java
   :linenos:
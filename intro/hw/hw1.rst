.. _HW1:

==============================================
Homework 1
==============================================

4.
a) 	cat index.rst  | grep '*' | grep -v "Prof" | awk -F"[, ]" '{print $2, $3, $4, $5, $6, $7}' > roster.txt

b) 	wc roster.txt

|	Result:       17      52     365 roster.txt
|	=> There are 17 currently enrolled students.

c)	cat roster.txt | awk '{print $1}' | sort -r

|	Zhang
|	Xu
|	Vargas
|	Pansodtee
|	Nasab
|	Milenska
|	Mazhari
|	Liu
|	Li
|	Hou
|	Gutierrez
|	Gulla
|	Gruey
|	Gonzalez
|	Findley
|	Ding
|	Arevalo

d)	cat roster.txt | grep "AMS" | wc

|	Result:        4      12      87
|	=> There are 4 students in AMS

e)	cat roster.txt | grep "SciCAM" | awk '{print $1}' | sort -r

|	Result: 
|	Vargas
|	Milenska
|	Liu
|	Gulla


"""
AMS 209 Homework 4 problem 1

Write a function named right_justify that takes a string named s as 
a parameter and prints the string with enough leading spaces so that 
the last letter of the string is in column 70 of the display

"""

def right_justify(s):

	"""
	Arguments: 
		s: An input string whose length is at most 70
	Return:
		None

	"""
	if len(s) <= 70:
		print ' ' * (70 - len(s)) + s
	else:
		print "Your string is too long!"
	

# right_justify('Suhan')
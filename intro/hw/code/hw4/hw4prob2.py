"""
AMS 209 Homework 4 problem 1

Consider the following function example do_twice that takes a function object as an argument and calls it twice:

def do_twice(f):
      f()
      f()

Here is an example that uses do_twice to call a function named print_spam twice:

def print_spam():
      print 'spam'

do_twice(print_spam)

a. Type this example into a script and test it.
b. Modify do_twice so that it takes two arguments, a function object and a value, and calls the function twice, passing the value as an argument.
c.Write a more general version of print_spam, called print_twice, that takes a string as a parameter and prints it twice.
d. Use the modified version of do_twice to call print_twice twice, passing spam as an argument.

"""
# a. Test original script
#    The result is in README.prob2


# b. Modified do_twice

def do_twice(f,value):
	f(value)
	f(value)


# c. Modified print_twice

def print_twice(str):
	print str
	print str


# d. Use do_twice to call print_twice
#	 The result is in README.prob2

do_twice(print_twice,'spam')



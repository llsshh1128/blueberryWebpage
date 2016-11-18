from math import pow

def convertLen(num, unit):

	ratio = {'meter': 1., 'mile': 0.000621, 'inch': 39.370079, 'foot': 3.28084, 'yard': 1.093613}
	rl = ['mile', 'inch', 'foot', 'meter', 'yard']

	lenList = []

	for i in rl:
		length = num / ratio[unit] * ratio[i]
		if (i != unit):
			lenList.append(str(length) + ' ' + i)

	print lenList

	ratio2 = {'nm': pow(10,9), 'um': pow(10,6), 'mm': pow(10,3), 'cm': pow(10,2), 'km': pow(10,-3)}
	rl2 = ['nm', 'um', 'mm', 'cm', 'km']

	lenList2 =[]

	for j in rl2:
		length2 = num / ratio[unit] * ratio2[j]
		lenList2.append(str(length2) + ' ' + j)

	print lenList2




if __name__ == "__main__":

	userLen = input("Please input a length (number only): ")
	userUnit = raw_input("Please type a unit system (meter, mile, inch, foot, yard): ")

	convertLen(userLen,userUnit)



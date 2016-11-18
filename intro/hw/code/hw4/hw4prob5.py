def print_yourName(nameList, inverse = True):

	if inverse == True:
		name = nameList[0].capitalize() + ' ' + nameList[1].capitalize()
	else:
		name = nameList[1].capitalize() + ', ' + nameList[0].capitalize()
	
	return name

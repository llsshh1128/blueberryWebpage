def wordList(n):
	list = []
	fn = open('words.txt')
	#print fn
	#print type(fn)
	for line in fn:
	    word = line.strip()
	    list.append(word)
	    if len(list) >= n:
	    	break
	    #print word
	    #print line

	return list




def wordListAll():
	list = []
	fn = open('words.txt')
	#print fn
	#print type(fn)
	for line in fn:
	    word = line.strip()
	    list.append(word)
	    #print word
	    #print line

	return list




def wordDict(n,inputWord):
	dict = {}
	fn = open('words.txt')
	#print fn
	#print type(fn)
	for line in fn:
	    word = line.strip()
	    dict[word] = 1
	    if len(dict) >= n:
	    	break

	if inputWord in dict:
		print inputWord + " is in the dictionary."
	else:
		print inputWord + " is not in the dictionary"

	return dict




def wordDictAll():
	dict = {}
	fn = open('words.txt')
	#print fn
	#print type(fn)
	for line in fn:
	    word = line.strip()
	    dict[word] = 0

	return dict





if __name__ == "__main__":
	print "##################################"
	print "   Get First N Words as a List"
	print "##################################"

	print '\n'
	n1 = 0
	while n1 <= 0:
		n1 = input("Please enter a number N (Positive integer only): ")

	wdListN = wordList(n1)
	print wdListN
	print '\n'

	print "##################################"
	print "    Get All Words as a List"
	print "##################################"

	print '\n'
	wdList = wordListAll()

	pt = raw_input("Do you want to print the whole list? (Y/N)")
	if pt == 'Y':
		print wdList

	print '\n'

	print "##################################"
	print "Get First N Words as a Dictionary"
	print "##################################"

	print '\n'
	n2 = 0
	while n2 <= 0:
		n2 = input("Please enter a number N (Positive integer only): ")

	inputWd = raw_input("Please enter a string (No quotation mark is needed): ")
	print '\n'

	wdDictN = wordDict(n2,inputWd)
	print '\n'
	print wdDictN
	print '\n'

	print "##################################"
	print "  Get All Words as a Dictionary"
	print "##################################"

	print '\n'
	wdDict = wordDictAll()

	pt = raw_input("Do you want to print the whole dictionary? (Y/N)")
	if pt == 'Y':
		print wdDict










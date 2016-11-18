def get_Sum(list):
	sumList = [0] * len(list)
	sumList[0] = list[0]

	for i in range(1,len(list)):
		sumList[i] = sumList[i - 1] + list[i]

	return sumList
		
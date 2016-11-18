def is_sorted(list):

	for i in range(1,len(list)):
		if list[i] < list[i - 1]:
			return False

	return True



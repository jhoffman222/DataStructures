def linearsearch(lst, len, num):
    for num in range(0, len):
        if (lst[num] == num):
            return num
    return -1
lst = [8, 4, 2, 6, 7, 10]
number = 10
size = len(lst)
index = linearsearch(lst, size, number)
if (index == -1):
    print("its not here")
else:
    print("its there!")

def bublesort(array):
    size = len(array)
    for i in range(size):
        for j in range(0, size - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]
arr = [0,2,1,1,8,-10]
bublesort(arr)
for i in range(len(arr)):
    print(arr[i])

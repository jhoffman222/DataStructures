def binary_search(list, size, right, key):
    if right >= size:
        mid = size + (right - size) // 2
        if list[mid] == key:
            return mid
        elif list[mid] > key:
            return binary_search(list, size, mid - 1, key)
        else:
            return binary_search(list, mid + 1, right, key)
    else:
        return -1

list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
numerToSearchFor = 16

i = binary_search(list, 0, len(list) - 1, numerToSearchFor)

if i != -1:
    print("Located at index " + str(i))
else:
    print("The numer is not in the list")

lst = [0, -1, 55, 1, 24, 25, 24]

for i in range(len(lst)):
    least = i
    for j in range(i + 1, len(lst)):
        if lst[least] > lst[j]:
            least = j

    temporary = lst[i]
    lst[i] = lst[least]
    lst[least] = temporary

for i in range(len(lst)):
    print(lst[i])

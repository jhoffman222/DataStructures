def toString(List):
    return ''.join(List)
 
def permute(lis, lft, rt):
    if lft==rt:
        print toString(lis)
    else:
        for i in xrange(lft,rt+1):
            a[lft], a[i] = a[i], a[lft]
            permute(a, lft+1, rt)
            a[lft], a[i] = a[i], a[lft]
 
string = "ABC"
len = len(string)
lis = list(string)
permute(lis, 0, len-1)

tup=tuple(map(int,input("Enter num:").split(',')))
for i in tup:
    if i%5==0:
        print(i,end=' ')
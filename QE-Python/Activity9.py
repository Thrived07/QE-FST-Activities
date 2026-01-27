l1=[1,2,3,4,5,6,7,8,9]
l2=[1,2,3,4,5,6,7,8,9]
l3=[]
for i in l1:
    if i%2!=0:
        l3.append(i)
for j in l2:
    if j%2==0:
        l3.append(j)
print(l3)